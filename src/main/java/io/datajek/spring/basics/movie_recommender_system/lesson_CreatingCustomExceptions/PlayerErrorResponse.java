package io.datajek.spring.basics.movie_recommender_system.lesson_CreatingCustomExceptions;
import java.time.ZonedDateTime;

public class PlayerErrorResponse {

//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    private ZonedDateTime timestamp;
    private int statusCode;
    private String path;
    private String message;

    public PlayerErrorResponse(ZonedDateTime timestamp, int statusCode, String path, String message) {
        super();
        this.statusCode = statusCode;
        this.path = path;
        this.message = message;
    }


    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
