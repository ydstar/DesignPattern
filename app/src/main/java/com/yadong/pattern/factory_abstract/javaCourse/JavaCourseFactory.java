package com.yadong.pattern.factory_abstract.javaCourse;

import com.yadong.pattern.factory_abstract.BaseArticle;
import com.yadong.pattern.factory_abstract.BaseVideo;
import com.yadong.pattern.factory_abstract.CourseFactory;

/**
 * 具体的Java课程工厂,专门生产JavaVideo和JavaArticle
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public BaseVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public BaseArticle getArticle() {
        return new JavaArticle();
    }
}
