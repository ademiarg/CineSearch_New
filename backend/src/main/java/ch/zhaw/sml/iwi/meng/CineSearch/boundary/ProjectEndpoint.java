package ch.zhaw.sml.iwi.meng.CineSearch.boundary;

import java.security.Principal;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.sml.iwi.meng.CineSearch.controller.ProjectController;
import ch.zhaw.sml.iwi.meng.CineSearch.entity.Project;
import ch.zhaw.sml.iwi.meng.CineSearch.entity.ToDo;

@RestController
@CrossOrigin
public class ProjectEndpoint {

    @Autowired
    private ProjectController projectController;

    @RequestMapping(path = "/api/project", method = RequestMethod.GET)
    @PreAuthorize("isAuthenticated() AND hasRole('USER')")
    public List<Project> getProjects(Principal principal) {
        return projectController.listAllProjects(principal.getName());
    }
    
    @RequestMapping(path = "/api/project/{id}", method = RequestMethod.POST)
    @PreAuthorize("isAuthenticated() AND hasRole('USER')")
    public void addToDo(@RequestParam(name="id") Long projectId, @RequestBody ToDo toDo,  Principal principal) {
        projectController.addToDo(projectId, toDo, principal.getName());
    }
}