package xyz.hplus.guava.pojo.vo;

import lombok.Data;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@Data
public class Result<T> {
    private Integer success;
    private String msg;
    private T data;

    private Result(Integer success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Result(T data) {
        this.success = 1;
        this.msg = "ok";
        this.data = data;
    }

    public static Result<Void> error(String errMsg) {
        return new Result<>(0, errMsg);
    }

    public static Result<Void> success() {
        return new Result<>(1, "ok");
    }

}
