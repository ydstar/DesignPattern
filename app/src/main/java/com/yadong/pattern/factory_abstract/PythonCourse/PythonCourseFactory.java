package com.yadong.pattern.factory_abstract.PythonCourse;

import com.yadong.pattern.factory_abstract.BaseArticle;
import com.yadong.pattern.factory_abstract.BaseVideo;
import com.yadong.pattern.factory_abstract.CourseFactory;
import com.yadong.pattern.factory_abstract.javaCourse.JavaArticle;
import com.yadong.pattern.factory_abstract.javaCourse.JavaVideo;

/**
 * 具体的Python课程工厂,专门生产PythonVideo和PythonArticle
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public BaseVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    public BaseArticle getArticle() {
        return new PythonArticle();
    }
}
