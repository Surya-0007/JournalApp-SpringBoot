//package com.surya.MyFirstProject.controller;
//
//import com.surya.MyFirstProject.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalAppController {
//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @GetMapping("/id/{myId}")
//    public JournalEntry getEntryById(@PathVariable long myId){
//        return journalEntries.get(myId);
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    @DeleteMapping("/id/{myId}")
//    public JournalEntry deleteEntryById(@PathVariable long myId){
//        return journalEntries.remove(myId);
//    }
//
//    @PutMapping("/id/{myId}")
//    public JournalEntry updateEntryById(@PathVariable long myId, @RequestBody JournalEntry myEntry){
//        return journalEntries.put(myId, myEntry);
//    }
//
//
//}
