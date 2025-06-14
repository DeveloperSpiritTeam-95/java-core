//package com.springboot.seniordev.HTTPandRESTfulAPIs;
//
//import java.util.ArrayList;
//import java.util.List;
///**
// * @author prabhakar, @Date 20-03-2025
// */
//  Rest Controller API Creation here
//// This annotation marks the class as a REST controller, handling web requests.
//@RestController
//@RequestMapping("/api/books") // Base URL for all endpoints in this controller
//public class BookController {
//
//    // A list to store books (in-memory storage for this example).
//    private List<Book> books = new ArrayList<>();
//    private long nextId = 1;
//
//    // Constructor to initialize some books.
//    public BookController() {
//        books.add(new Book(nextId++, "The Lord of the Rings", "J.R.R. Tolkien"));
//        books.add(new Book(nextId++, "Pride and Prejudice", "Jane Austen"));
//    }
//
//    // This method handles GET requests to /api/books and returns all books.
//    @GetMapping
//    public ResponseEntity<List<Book>> getAllBooks() {
//        return new ResponseEntity<>(books, HttpStatus.OK); // 200 OK
//    }
//
//    // This method handles GET requests to /api/books/{id} and returns a specific book by ID.
//    @GetMapping("/{id}")
//    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
//        Optional<Book> book = books.stream().filter(b -> b.getId().equals(id)).findFirst();
//        if (book.isPresent()) {
//            return new ResponseEntity<>(book.get(), HttpStatus.OK); // 200 OK
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
//        }
//    }
//
//    // This method handles POST requests to /api/books and creates a new book.
//    @PostMapping
//    public ResponseEntity<Book> createBook(@RequestBody Book book) {
//        book.setId(nextId++);
//        books.add(book);
//        return new ResponseEntity<>(book, HttpStatus.CREATED); // 201 Created
//    }
//
//    // This method handles PUT requests to /api/books/{id} and updates an existing book.
//    @PutMapping("/{id}")
//    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
//        for (int i = 0; i < books.size(); i++) {
//            Book book = books.get(i);
//            if (book.getId().equals(id)) {
//                updatedBook.setId(id);
//                books.set(i, updatedBook);
//                return new ResponseEntity<>(updatedBook, HttpStatus.OK); // 200 OK
//            }
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
//    }
//
//    // This method handles DELETE requests to /api/books/{id} and deletes a book by ID.
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
//        for (int i = 0; i < books.size(); i++) {
//            Book book = books.get(i);
//            if (book.getId().equals(id)) {
//                books.remove(i);
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204 No Content
//            }
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
//    }
//}
