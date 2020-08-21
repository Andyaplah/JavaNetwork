package com.andy.network.NIO;

import java.io.IOException;
import java.nio.channels.SelectionKey;

public interface MessageHandle {

    void handleAccept(SelectionKey selectionKey) throws IOException;

    String handleRead(SelectionKey selectionKey) throws IOException;
}
