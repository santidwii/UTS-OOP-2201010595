/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camscanner;

/**
 *
 * @author DwikSanti(2201010595)
 * TGL:24-05-24
 */
public class DocumentManager {
    private final Document[] documents;
    private int count;

    public DocumentManager(int capacity) {
        documents = new Document[capacity];
        count = 0;
    }

    public void addDocument(Document document) {
        if (count < documents.length) {
            documents[count] = document;
            count++;
        } else {
            System.out.println("Cannot add document, storage is full.");
        }
    }

    public void displayDocuments() {
        if (count == 0) {
            System.out.println("No documents available.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(documents[i]);
            }
        }
    }

    public void updateDocument(int index, Document newDoc) {
        if (index >= 0 && index < count) {
            documents[index] = newDoc;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void deleteDocument(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                documents[i] = documents[i + 1];
            }
            documents[count - 1] = null;
            count--;
        } else {
            System.out.println("Invalid index.");
        }
    }
}

