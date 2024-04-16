package com.facebook.flipper.plugins.common;

import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
final class RingBuffer<T> {
    final List<T> mBuffer = new LinkedList();
    final int mBufferSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RingBuffer(int i) {
        this.mBufferSize = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<T> asList() {
        return this.mBuffer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        this.mBuffer.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void enqueue(T t) {
        if (this.mBuffer.size() >= this.mBufferSize) {
            this.mBuffer.remove(0);
        }
        this.mBuffer.add(t);
    }
}
