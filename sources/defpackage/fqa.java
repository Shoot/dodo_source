package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lfqa;", "Lky;", "Ljava/io/IOException;", "cause", "x", "", "B", "Ljava/net/Socket;", "o", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: fqa  reason: default package */
/* loaded from: classes3.dex */
public final class fqa extends ky {
    private final Socket o;

    public fqa(Socket socket) {
        z65.h(socket, "socket");
        this.o = socket;
    }

    @Override // defpackage.ky
    protected void B() {
        Logger logger;
        Logger logger2;
        try {
            this.o.close();
        } catch (AssertionError e) {
            if (c77.d(e)) {
                logger2 = d77.a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.o, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = d77.a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.o, (Throwable) e2);
        }
    }

    @Override // defpackage.ky
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
