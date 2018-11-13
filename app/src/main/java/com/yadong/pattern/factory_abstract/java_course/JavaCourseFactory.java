package com.yadong.pattern.factory_abstract.java_course;

import com.yadong.pattern.factory_abstract.BaseNote;
import com.yadong.pattern.factory_abstract.BaseVideo;
import com.yadong.pattern.factory_abstract.CourseFactory;

/**
 * 具体的Java课程工厂,专门生产JavaVideo和JavaNotes
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public BaseVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public BaseNote getNote() {
        return new JavaNote();
    }
}
