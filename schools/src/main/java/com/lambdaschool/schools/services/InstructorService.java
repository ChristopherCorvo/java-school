package com.lambdaschool.schools.services;

import com.lambdaschool.schools.models.Slip;
import com.lambdaschool.schools.models.Instructor;

public interface InstructorService
{


    Instructor addAdvice(long id, Slip advice);
}
