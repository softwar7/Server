package softwar7.global.constant;

public enum ExceptionMessage {

    MEMBER_NOT_FOUND_EXCEPTION("회원을 찾을 수 없습니다"),
    NICKNAME_DUPLICATE_EXCEPTION("이미 존재하는 닉네임입니다"),
    REFRESH_TOKEN_NOT_FOUND_EXCEPTION("RefreshToken을 찾을 수 없습니다"),
    ALBUM_IMAGE_NOT_FOUND_EXCEPTION("앨범 이미지를 찾을 수 없습니다"),
    PASSWORD_NOT_MATCH_EXCEPTION("비밀번호가 일치하지 않습니다"),
    ADMIN_PASSWORD_NOT_MATCH_EXCEPTION("관리자 비밀번호가 일치하지 않습니다"),
    ACCESS_TOKEN_JSON_PARSING("AccessToken으로부터 정보를 가져올 수 없습니다"),
    CLAIMS_UNAUTHORIZED("토큰으로부터 Claims 정보를 가져올 수 없습니다"),
    COOKIE_NOT_EXIST("쿠키가 존재하지 않습니다"),
    MEMBER_SESSION_JSON_PARSING("세션 정보를 Json 형태로 파싱할 수 없습니다"),
    REFRESH_TOKEN_NOT_MATCH("Refresh Token이 일치하지 않습니다"),
    REFRESH_TOKEN_NOT_EXIST("Refresh Token을 찾을 수 없습니다"),
    REFRESH_TOKEN_NOT_VALID("Refresh Token이 유효하지 않습니다"),
    PROFILES_SAVE_EXCEPTION("프로필 사진을 저장할 수 없습니다");

    public final String message;

    ExceptionMessage(final String message) {
        this.message = message;
    }
}
