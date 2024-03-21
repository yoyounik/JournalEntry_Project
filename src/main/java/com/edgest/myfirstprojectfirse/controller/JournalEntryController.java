package com.edgest.myfirstprojectfirse.controller;

import com.edgest.myfirstprojectfirse.entity.JournalEntry;
import com.edgest.myfirstprojectfirse.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
       return myEntry;
    }

//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntry(@PathVariable ObjectId myId){
//        return null;
//    }
//
//    @DeleteMapping("/id/{id}")
//    public JournalEntry updateJournalById(@PathVariable ObjectId id, @RequestBody JournalEntry myEntry) {
//        return null;
//    }
}
