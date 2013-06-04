package com.train.client.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Random;
import com.sencha.gxt.core.client.util.DateWrapper;
import com.train.client.model.BaseDto;
import com.train.client.model.FolderDto;
import com.train.client.model.MusicDto;

public class TestData {

  private static int autoId = 0;

  public static FolderDto getMusicRootFolder() {
    FolderDto root = makeFolder("Root");

    FolderDto author = makeFolder("Beethoven");
    List<BaseDto> children = new ArrayList<BaseDto>();
    children.add(author);
    root.setChildren(children);

    FolderDto genre = makeFolder("Quartets");
    author.addChild(genre);

    genre.addChild(makeMusic("Six String Quartets", author, genre));
    genre.addChild(makeMusic("Three String Quartets", author, genre));
    genre.addChild(makeMusic("Grosse Fugue for String Quartets", author, genre));

    genre = makeFolder("Sonatas");
    author.addChild(genre);

    genre.addChild(makeMusic("Sonata in A Minor", author, genre));
    genre.addChild(makeMusic("Sonata in F Major", author, genre));

    genre = makeFolder("Concertos");
    author.addChild(genre);

    genre.addChild(makeMusic("No. 1 - C", author, genre));
    genre.addChild(makeMusic("No. 2 - B-Flat Major", author, genre));
    genre.addChild(makeMusic("No. 3 - C Minor", author, genre));
    genre.addChild(makeMusic("No. 4 - G Major", author, genre));
    genre.addChild(makeMusic("No. 5 - E-Flat Major", author, genre));

    genre = makeFolder("Symphonies");
    author.addChild(genre);

    genre.addChild(makeMusic("No. 1 - C Major", author, genre));
    genre.addChild(makeMusic("No. 2 - D Major", author, genre));
    genre.addChild(makeMusic("No. 3 - E-Flat Major", author, genre));
    genre.addChild(makeMusic("No. 4 - B-Flat Major", author, genre));
    genre.addChild(makeMusic("No. 5 - C Minor", author, genre));
    genre.addChild(makeMusic("No. 6 - F Major", author, genre));
    genre.addChild(makeMusic("No. 7 - A Major", author, genre));
    genre.addChild(makeMusic("No. 8 - F Major", author, genre));
    genre.addChild(makeMusic("No. 9 - D Minor", author, genre));

    author = makeFolder("Brahms");
    root.addChild(author);

    genre = makeFolder("Concertos");
    author.addChild(genre);

    genre.addChild(makeMusic("Violin Concerto", author, genre));
    genre.addChild(makeMusic("Double Concerto - A Minor", author, genre));
    genre.addChild(makeMusic("Piano Concerto No. 1 - D Minor", author, genre));
    genre.addChild(makeMusic("Piano Concerto No. 2 - B-Flat Major", author, genre));

    genre = makeFolder("Quartets");
    author.addChild(genre);

    genre.addChild(makeMusic("Piano Quartet No. 1 - G Minor", author, genre));
    genre.addChild(makeMusic("Piano Quartet No. 2 - A Major", author, genre));
    genre.addChild(makeMusic("Piano Quartet No. 3 - C Minor", author, genre));
    genre.addChild(makeMusic("String Quartet No. 3 - B-Flat Minor", author, genre));

    genre = makeFolder("Sonatas");
    author.addChild(genre);

    genre.addChild(makeMusic("Two Sonatas for Clarinet - F Minor", author, genre));
    genre.addChild(makeMusic("Two Sonatas for Clarinet - E-Flat Major", author, genre));

    genre = makeFolder("Symphonies");
    author.addChild(genre);

    genre.addChild(makeMusic("No. 1 - C Minor", author, genre));
    genre.addChild(makeMusic("No. 2 - D Minor", author, genre));
    genre.addChild(makeMusic("No. 3 - F Major", author, genre));
    genre.addChild(makeMusic("No. 4 - E Minor", author, genre));

    author = makeFolder("Mozart");
    root.addChild(author);

    genre = makeFolder("Concertos");
    author.addChild(genre);

    genre.addChild(makeMusic("Piano Concerto No. 12", author, genre));
    genre.addChild(makeMusic("Piano Concerto No. 17", author, genre));
    genre.addChild(makeMusic("Clarinet Concerto", author, genre));
    genre.addChild(makeMusic("Violin Concerto No. 5", author, genre));
    genre.addChild(makeMusic("Violin Concerto No. 4", author, genre));

    return root;
  }

  private static FolderDto makeFolder(String name) {
    FolderDto theReturn = new FolderDto(++autoId, name);
    theReturn.setChildren((List<BaseDto>) new ArrayList<BaseDto>());
    return theReturn;
  }

  private static MusicDto makeMusic(String name, FolderDto author, FolderDto genre) {
    return makeMusic(name, author.getName(), genre.getName());
  }

  private static MusicDto makeMusic(String name, String author, String genre) {
    return new MusicDto(++autoId, name, genre, author);
  }
}
