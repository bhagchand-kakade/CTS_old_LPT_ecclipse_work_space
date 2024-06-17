package com.app.brinkers;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

public class Routes extends RouteBuilder {

	private final Set<Book> books = Collections.synchronizedSet(new LinkedHashSet<>());

	public Routes() {
		this.books.add(new Book("Java programming", "It is core java related book"));
	}

	@Override
	public void configure() throws Exception {

		restConfiguration().bindingMode(RestBindingMode.json);

		rest("/books").get().to("direct:getBooks")

				.post().type(Book.class).to("direct:addBook");

		from("direct:getBooks").setBody().constant(books);
		
		from("direct:addFruit")
        .process().body(Book.class, books::add)
        .setBody().constant(books);

	}

}
