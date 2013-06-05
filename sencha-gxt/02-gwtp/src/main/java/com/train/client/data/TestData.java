package com.train.client.data;

import com.train.client.model.BaseDto;
import com.train.client.model.FolderDto;
import com.train.client.model.MusicDto;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    private static int autoId = 0;

    public static FolderDto getMusicRootFolder() {
        FolderDto root = makeFolder("Root");

        FolderDto author = makeFolder("学员管理");
        List<BaseDto> children = new ArrayList<BaseDto>();
        children.add(author);

        author.addChild(makeMusic("学员列表", "", ""));
        author.addChild(makeMusic("导入学员", "", ""));
        author.addChild(makeMusic("功能三", "", ""));
        author.addChild(makeMusic("功能四", "", ""));

        root.setChildren(children);
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
