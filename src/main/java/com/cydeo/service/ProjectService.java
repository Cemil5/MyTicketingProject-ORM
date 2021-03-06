package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.utils.Status;

public interface ProjectService extends CrudService<ProjectDTO, String> {

    void complete(ProjectDTO project);

    ProjectDTO save(ProjectDTO object, Status status);
}
