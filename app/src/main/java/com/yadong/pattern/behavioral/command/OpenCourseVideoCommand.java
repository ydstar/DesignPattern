package com.yadong.pattern.behavioral.command;

/**
 * 第3步
 * 打开课程视频命令
 */
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
