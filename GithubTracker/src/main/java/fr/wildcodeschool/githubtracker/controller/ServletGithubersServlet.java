package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletGithubersServlet",urlPatterns = {"/githubers"})
public class ServletGithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Githuber> githuberList = new ArrayList<>();
        for (int i = 0;i<5;i++){
            Githuber githuber = new Githuber();
            githuber.setId(i+1);
            githuber.setName("githuber"+" " +(i+1));
            githuberList.add(i,githuber);

        }

        request.setAttribute("githubers",githuberList);
        request.getRequestDispatcher("/githubers.jsp").forward(request,response);
    }
}
