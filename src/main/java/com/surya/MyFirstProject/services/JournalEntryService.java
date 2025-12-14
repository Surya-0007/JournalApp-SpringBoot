package com.surya.MyFirstProject.services;

import com.surya.MyFirstProject.entity.JournalEntry;
import com.surya.MyFirstProject.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> getById(ObjectId Id){
        return journalEntryRepository.findById(Id);
    }

    public void deleteById(ObjectId Id){
        journalEntryRepository.deleteById(Id);
    }
}
