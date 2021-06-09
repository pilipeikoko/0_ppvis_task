package org.bsuir.task.entity;

public interface Secretary {
    boolean addDocument(Folder folder, Document document);

    Document searchDocumentByHeader(Folder folder, String header);

    Document searchDocumentByWriter(Folder folder, String writer);
}
