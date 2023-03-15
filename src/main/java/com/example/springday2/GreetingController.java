package com.example.springday2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

// web application
@RestController

public class GreetingController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
     public List<StudentEntity> getAllTopics() {
        return studentService.getAllStudents();
    }
    @RequestMapping("/students/{id}")
    public StudentEntity getStudentList(@PathVariable Long id) {
        return studentService.getStudentInfo(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/students" )
    public void addStudent(@RequestBody StudentEntity studentEntity){
        studentService.addStudent(studentEntity);

    }

    @PostMapping("/student/create")
    public String createNewStudent(@RequestParam String email,@RequestParam String name){
        return email + " ," + name;
    }

    @PostMapping("/student/createJSON")
    public String createNewStudentWithJASON(@RequestBody StudentEntity student){
        return student.getId() + " ," + student.getName();
    }

//    @GetMapping(value = "/studentsXML", produces = MediaType.APPLICATION_XML_VALUE)
//    public ResponseEntity<StudentEntity> getFunnyStudentXML() {
//        StudentEntity student1 = new StudentEntity();
//        student1.setName("GGG");
//        student1.setId(9L);
//        return ResponseEntity.ok(student1);
//    }



    @GetMapping("/greeting")
    public String greeting() {
        return "Hello World";
    }
    @GetMapping("/image")
    public String image() {
        return "<img src=\"https://www.intecbrussel.be/img/logo3.png\" />";
    }

    @GetMapping("/video")
    public String video(){
        return "<iframe src=\"https://www.youtube.com/embed/uU1TJQRaonA\" width=680 height=480 splashscreen></iframe>";
    }
    @GetMapping("/html")
    public String html() {
        return "<!DOCTYPE html>\r" +
                "<html>\r" +
                "<head>\r" +
                "<title>Spring Boot App</title>\r" +
                "</head>\r" +
                "<body>\r" +
                "\r" +
                // add a container
                "<div id=\"container\">\r" +
                // add a header
                "<header>\r" +
                "<h1>Header</h1>\r" +
                "</header>\r" +
                // add a nav
                "<nav>\r" +
                "<ul>\r" +
                "<li><a href=\"#\">Link 1</a></li>\r" +
                "<li><a href=\"#\">Link 2</a></li>\r" +
                "<li><a href=\"#\">Link 3</a></li>\r" +
                "</ul>\r" +
                "</nav>\r" +
                // add a section
                "<section>\r" +
                "<h2>Section Heading</h2>\r" +
                "<p>Some text.</p>\r" +
                "</section>\r" +
                // add an article
                "<article>\r" +
                "<h2>Article Heading</h2>\r" +
                "<p>Some text.</p>\r" +
                "</article>\r" +
                // add a footer
                "<footer>\r" +
                "<p>Footer</p>\r" +
                "</footer>\r" +
                "</div>\r" +
                "\r" +
                "</body>\r" +
                "</html>";

    }

    @GetMapping("/css")
    public String css() {
        return "<!DOCTYPE html>\r" +
                "<html>\r" +
                "<head>\r" +
                "<style>\r" +
                "body {\r" +
                "  background-color: lightblue;\r" +
                "}\r" +
                "\r" +
                "h1 {\r" +
                "  color: white;\r" +
                "  text-align: center;\r" +
                "}\r" +
                "\r" +
                "p {\r" +
                "  font-family: verdana;\r" +
                "  font-size: 20px;\r" +
                "}\r" +
                "</style>\r" +
                "</head>\r" +
                "<body>\r" +
                "\r" +
                "<h1>This is a heading</h1>\r" +
                "<p>This is a paragraph.</p>\r" +
                "\r" +
                "</body>\r" +
                "</html>";
    }

    @GetMapping("/js")
    public String js() {
        return "<!DOCTYPE html>\r" +
                "<html>\r" +
                "<body>\r" +
                "\r" +
                "<h2>JavaScript in Body</h2>\r" +
                "\r" +
                "<p id=\"demo\"></p>\r" +
                "\r" +
                "<script>\r" +
                // create a button that counts the number of clicks
                "var counter = 0;\r" +
                "var button = document.createElement('button');\r" +
                "button.innerHTML = '0 clicks';\r" +
                "button.onclick = function() {\r" +
                "  button.innerHTML = ++counter + ' clicks';\r" +
                "};\r" +
                "document.body.appendChild(button);\r" +
                "</script>\r" +
                "\r" +
                "</body>\r" +
                "</html>";
    }

    @GetMapping("/jquery")
    public String jquery() {
        return "<!DOCTYPE html>\r" +
                "<html>\r" +
                "<head>\r" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r" +
                "<script>\r" +
                "$(document).ready(function(){\r" +
                "  $(\"p\").click(function(){\r" +
                "    $(this).hide();\r" +
                "  });\r" +
                "});\r" +
                "</script>\r" +
                "</head>\r" +
                "<body>\r" +
                "\r" +
                "<p>If you click on me, I will disappear.</p>\r" +
                "<p>Click me away!</p>\r" +
                "<p>Click me too!</p>\r" +
                "\r" +
                "</body>\r" +
                "</html>";
    }

    @GetMapping("/bootstrap")
    public String bootstrap() {
        return "<!DOCTYPE html>\r" +
                "<html>\r" +
                "<head>\r" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r" +
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r" +
                "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r" +
                "</head>\r" +
                "<body>\r" +
                "\r" +
                "<div class=\"container\">\r" +
                "  <h2>Alerts</h2>\r" +
                "  <div class=\"alert alert-success\">\r" +
                "    <strong>Success!</strong> This alert box could indicate a successful or positive action.\r" +
                "  </div>\r" +
                "  <div class=\"alert alert-info\">\r" +
                "    <strong>Info!</strong> This alert box could indicate a neutral informative change or action.\r" +
                "  </div>\r" +
                "  <div class=\"alert alert-warning\">\r" +
                "    <strong>Warning!</strong> This alert box could indicate a warning that might need attention.\r" +
                "  </div>\r" +
                "  <div class=\"alert alert-danger\">\r" +
                "    <strong>Danger!</strong> This alert box could indicate a dangerous or potentially negative action.\r" +
                "  </div>\r" +
                "</div>\r" +
                "\r" +
                "</body>\r" +
                "</html>";
    }

    @GetMapping("/animation")
    public String animation() {
        return "<!DOCTYPE html>\r" +
                "<html>\r" +
                "<head>\r" +
                "<style>\r" +
                "div {\r" +
                "  width: 100px;\r" +
                "  height: 100px;\r" +
                "  background: red;\r" +
                "  position: relative;\r" +
                "  animation-name: example;\r" +
                "  animation-duration: 4s;\r" +
                "}\r" +
                "\r" +
                "@keyframes example {\r" +
                "  from {background-color: red;}\r" +
                "  to {background-color: yellow;}\r" +
                "}\r" +
                "</style>\r" +
                "</head>\r" +
                "<body>\r" +
                "\r" +
                "<h1>Animation</h1>\r" +
                "\r" +
                "<p>Click the button to start the animation.</p>\r" +
                "\r" +
                "<button onclick=\"myFunction()\">Start Animation</button>\r" +
                "\r" +
                "<div></div>\r" +
                "\r" +
                "<script>\r" +
                "function myFunction() {\r" +
                "  var elem = document.querySelector(\"div\");\r" +
                "  var pos = 0;\r" +
                "  var id = setInterval(frame, 10);\r" +
                "  function frame() {\r" +
                "    if (pos == 350) {\r" +
                "      clearInterval(id);\r" +
                "    } else {\r" +
                "      pos++;\r" +
                "      elem.style.top = pos + 'px';\r" +
                "      elem.style.left = pos + 'px';\r" +
                "    }\r" +
                "  }\r" +
                "}\r" +
                "</script>\r" +
                "\r" +
                "</body>\r" +
                "</html>";
    }

    @GetMapping("/form")
    public String form() {
        return "<!DOCTYPE html>\r" +
                "<html>\r" +
                "<body>\r" +
                "\r" +
                "<h2>HTML Forms</h2>\r" +
                "\r" +
                "<form action=\"/post\" method=\"post\">\r" +
                "  First name:<br>\r" +
                "  <input type=\"text\" name=\"name\" value=\"Mickey\">\r" +
                "  <br>\r" +
                "  Last name:<br>\r" +
                "  <input type=\"text\" name=\"email\" value=\"Mouse\">\r" +
                "  <br><br>\r" +
                "  <input type=\"submit\" value=\"Submit\">\r" +
                "</form> \r" +
                "\r" +
                "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/post\".</p>\r" +
                "\r" +
                "</body>\r" +
                "</html>";
    }

    @PostMapping("/post")
    public String post(@RequestParam String name, @RequestParam String email) {
        return "Hello " + name + " your email is " + email;
    }

    @PutMapping("/put/{row}")
    public String put(@PathVariable Integer row) {
        return "put " + row;
    }

    @DeleteMapping("/delete/{row}")
    public String delete(@PathVariable Integer row) {
        return "delete " + row;
    }

    @GetMapping("/json")
    public String json() {
        return "{\r" +
                "  \"employees\": [\r" +
                "    {\"firstName\":\"John\", \"lastName\":\"Doe\"},\r" +
                "    {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},\r" +
                "    {\"firstName\":\"Peter\", \"lastName\":\"Jones\"}\r" +
                "  ]\r" +
                "}";
    }

    @GetMapping("/xml")
    public String xml() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r" +
                "<employees>\r" +
                "    <employee>\r" +
                "        <firstName>John</firstName>\r" +
                "        <lastName>Doe</lastName>\r" +
                "    </employee>\r" +
                "    <employee>\r" +
                "        <firstName>Anna</firstName>\r" +
                "        <lastName>Smith</lastName>\r" +
                "    </employee>\r" +
                "    <employee>\r" +
                "        <firstName>Peter</firstName>\r" +
                "        <lastName>Jones</lastName>\r" +
                "    </employee>\r" +
                "</employees>";
    }

    @GetMapping("/csv")
    public String csv() {
        return "firstName,lastName\r" +
                "John,Doe\r" +
                "Anna,Smith\r" +
                "Peter,Jones";
    }

    @GetMapping("/table")
    public String pdf() {
        return "<!DOCTYPE html>\r" +
                "<html>\r" +
                "<head>\r" +
                "<style>\r" +
                "table {\r" +
                "  font-family: arial, sans-serif;\r" +
                "  border-collapse: collapse;\r" +
                "  width: 100%;\r" +
                "}\r" +
                "\r" +
                "td, th {\r" +
                "  border: 1px solid #dddddd;\r" +
                "  text-align: left;\r" +
                "  padding: 8px;\r" +
                "}\r" +
                "\r" +
                "tr:nth-child(even) {\r" +
                "  background-color: #dddddd;\r" +
                "}\r" +
                "</style>\r" +
                "</head>\r" +
                "<body>\r" +
                "\r" +
                "<h2>HTML Table</h2>\r" +
                "\r" +
                "<table>\r" +
                "  <tr>\r" +
                "    <th>Firstname</th>\r" +
                "    <th>Lastname</th>\r" +
                "    <th>Age</th>\r" +
                "  </tr>\r" +
                "  <tr>\r" +
                "    <td>Jill</td>\r" +
                "    <td>Smith</td>\r" +
                "    <td>50</td>\r" +
                "  </tr>\r" +
                "  <tr>\r" +
                "    <td>Eve</td>\r" +
                "    <td>Jackson</td>\r" +
                "    <td>94</td>\r" +
                "  </tr>\r" +
                "  <tr>\r" +
                "    <td>John</td>\r" +
                "    <td>Doe</td>\r" +
                "    <td>80</td>\r" +
                "  </tr>\r" +
                "</table>\r" +
                "\r" +
                "</body>\r" +
                "</html>";
    }


}
