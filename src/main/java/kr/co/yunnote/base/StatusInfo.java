package kr.co.yunnote.base;

public enum  StatusInfo {
    OK(200, "정상적으로 호출되 었습니다."),
    NOT_FOUND(404 , "존재하지 않는 API 호출 입니다.");

    private int statusCode;
    private String statusMessage;

    StatusInfo(int statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }
}
