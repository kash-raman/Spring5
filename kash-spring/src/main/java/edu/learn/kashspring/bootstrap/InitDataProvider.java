package edu.learn.kashspring.bootstrap;

import edu.learn.kashspring.model.Author;
import edu.learn.kashspring.model.Book;
import edu.learn.kashspring.model.Publisher;
import edu.learn.kashspring.repos.AuthorRepo;
import edu.learn.kashspring.repos.BookRepo;
import edu.learn.kashspring.repos.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitDataProvider implements ApplicationListener<ContextRefreshedEvent> {
    private BookRepo bookRepo;
    private AuthorRepo authorRepo;
    private PublisherRepo publisherRepo;

    public InitDataProvider(BookRepo bookRepo, AuthorRepo authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }
@Autowired
    public InitDataProvider(BookRepo bookRepo, AuthorRepo authorRepo,PublisherRepo publisherRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
        this.publisherRepo = publisherRepo;
    }

    private void initDatabase() {
        Author author = new Author("Yashwanth", "Kanithkar");
        Book book = new Book("Let us C", "unknown");
        Publisher publisher = new Publisher("OReily", "123 Main St, Arizona 00000");

        author.getBooks().add(book);
        book.getAuthors().add(author);
        book.setPublisher(publisher);

        authorRepo.save(author);
        publisherRepo.save(publisher);
        bookRepo.save(book);


        Author author2 = new Author("dave", "Ron");
        Book book2 = new Book("Spring in action", "sadf");
        Publisher publisher2 = new Publisher("Ne Penigun", "123 ddasd St, Arizona 00000");

        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.getAuthors().add(author);
        book2.setPublisher(publisher2);
        publisherRepo.save(publisher2);
        authorRepo.save(author2);
        bookRepo.save(book2);


    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("In this class ---- " + this.getClass().getName());
        initDatabase();
    }
}




