package org.bsuir.task.entity;

import org.bsuir.task.exception.CustomException;
import org.bsuir.task.validator.CustomValidator;

import java.time.LocalDate;

public class Document {
    private String header;
    private LocalDate createDate;
    private String writer;
    private String context;

    public Document(Folder folder, String header, LocalDate createDate, String writer, String context) throws CustomException {
        this.header = header;
        this.createDate = createDate;
        this.writer = writer;
        this.context = context;
        if (!CustomValidator.isHeaderTaken(folder.getDocuments(), header)) {
            folder.addDocument(this);
        } else {
            throw new CustomException("Couldn't set folder. The header is already taken! Header: " + header);
        }
    }

    public String getHeader() {
        return header;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public String getWriter() {
        return writer;
    }

    public String getContext() {
        return context;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setContext(String context) {
        this.context = context;
    }
}