package com.yadong.pattern.factory_abstract.java_course;

import com.yadong.pattern.factory_abstract.BaseNotes;
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
    public BaseNotes getNotes() {
        return new JavaNotes();
    }
}
