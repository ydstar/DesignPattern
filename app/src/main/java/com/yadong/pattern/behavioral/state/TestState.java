package com.yadong.pattern.behavioral.state;

/**
 * 状态模式
 */
public class TestState {

    /**
     * 播放一个课程,有多种状态,播放,暂停,快进,停止
     */
    public static void test() {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.stop();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
    }
}
