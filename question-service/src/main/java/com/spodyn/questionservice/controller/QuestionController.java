package com.spodyn.questionservice.controller;

import com.spodyn.questionservice.model.Question;
import com.spodyn.questionservice.model.QuestionWrapper;
import com.spodyn.questionservice.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.spodyn.questionservice.service.QuestionService;
import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);

    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz
            (@RequestParam String categoryName, @RequestParam Integer numQuestions){
        return questionService.getQuestionsForQuiz(categoryName, numQuestions);
    }

    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionsIds){
        return questionService.getQuestionsFromId(questionsIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getscore(@RequestBody List<Response> responses)
    {
        return questionService.getScore(responses);
    }

}
