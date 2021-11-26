package springMVC2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springMVC2.dao.LibDAO;



@Controller
@RequestMapping("/books")
public class BooksController {

    private final LibDAO libDAO;

    @Autowired
    public BooksController(LibDAO libDAO) {
        this.libDAO = libDAO;
    }

    @GetMapping()
    public String getAllBooks(Model model) {
        model.addAttribute("books", libDAO.getAllBooks());
        return "books/getAllBooks";
    }

    @GetMapping("/checkedOutBooks")
    public String checkedOutBooks(Model model) {
        model.addAttribute("books1", libDAO.checkedOutBooks());
        return "books/checkedOutBooks";
    }

}