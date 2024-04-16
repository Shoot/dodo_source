package com.facebook.flipper.core;
/* loaded from: classes2.dex */
public abstract class ErrorReportingRunnable implements Runnable {
    private final FlipperConnection mConnection;

    public ErrorReportingRunnable(FlipperConnection flipperConnection) {
        this.mConnection = flipperConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            runOrThrow();
        } finally {
            try {
            } finally {
            }
        }
    }

    protected abstract void runOrThrow() throws Exception;

    protected void doFinally() {
    }
}
