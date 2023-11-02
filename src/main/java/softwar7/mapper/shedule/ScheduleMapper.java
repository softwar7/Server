package softwar7.mapper.shedule;

import softwar7.domain.member.vo.MemberSession;
import softwar7.domain.schedule.persist.Schedule;
import softwar7.mapper.shedule.dto.ScheduleResponse;
import softwar7.mapper.shedule.dto.ScheduleSaveRequest;

public enum ScheduleMapper {

    ScheduleMapper() {
    };

    public static Schedule toEntity(final MemberSession memberSession, final ScheduleSaveRequest dto) {
        return Schedule.builder()
                .memberId(memberSession.id())
                .channelId(dto.channelId())
                .username(memberSession.username())
                .scheduleName(dto.name())
                .content(dto.content())
                .startTime(dto.start())
                .endTime(dto.end())
                .build();
    }

    public static ScheduleResponse toResponse(final Schedule schedule) {
        return ScheduleResponse.builder()
                .id(schedule.getId())
                .name(schedule.getScheduleName())
                .content(schedule.getContent())
                .start(schedule.getStartTime())
                .end(schedule.getEndTime())
                .channelId(schedule.getChannelId())
                .approval(schedule.getApproval())
                .build();
    }
}
