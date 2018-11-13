package com.yadong.pattern.factory_abstract.python_course;

import com.yadong.pattern.factory_abstract.BaseArticle;
import com.yadong.pattern.factory_abstract.BaseVideo;
import com.yadong.pattern.factory_abstract.CourseFactory;

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
