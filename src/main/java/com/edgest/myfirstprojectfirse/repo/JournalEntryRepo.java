package com.edgest.myfirstprojectfirse.repo;

import com.edgest.myfirstprojectfirse.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId>{

}
