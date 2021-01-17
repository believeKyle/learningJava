package com.kyle.corejava.exception;

import java.io.IOException;

public class FileFormatException extends IOException {
    public FileFormatException() {
    }

    public FileFormatException(String message) {
        super(message);
    }
}
