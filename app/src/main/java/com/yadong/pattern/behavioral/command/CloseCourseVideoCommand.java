package com.yadong.pattern.behavioral.command;

/**
 * 第3步
 * 关闭课程视频命令
 */
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
