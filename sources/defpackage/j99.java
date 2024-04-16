package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RecordingInputConnection.android.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010b\u001a\u00020P\u0012\u0006\u0010I\u001a\u00020E\u0012\u0006\u0010M\u001a\u00020\u0006¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0016J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010!\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\tH\u0016J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010!\u001a\u00020\tH\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\tH\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\tH\u0016J\u0012\u00100\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000101H\u0016J\n\u00105\u001a\u0004\u0018\u000104H\u0016J\u0010\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\tH\u0016J\u0010\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0016J\u001c\u0010@\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016J\"\u0010D\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010!\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010>H\u0016R\u0017\u0010I\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010M\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010NR*\u0010W\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010NR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010JR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010J¨\u0006e"}, d2 = {"Lj99;", "Landroid/view/inputmethod/InputConnection;", "Lad3;", "editCommand", "", "a", "", "b", c.a, "", "code", DateTokenConverter.CONVERTER_KEY, "beginBatchEdit", "endBatchEdit", "closeConnection", "", "text", "newCursorPosition", "commitText", "start", "end", "setComposingRegion", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "maxChars", "flags", "getTextBeforeCursor", "getTextAfterCursor", "getSelectedText", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "Landroid/os/Handler;", "getHandler", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "reqModes", "getCursorCapsMode", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "Lo35;", "Lo35;", "getEventCallback", "()Lo35;", "eventCallback", "Z", "getAutoCorrect", "()Z", "autoCorrect", "I", "batchDepth", "Lvab;", "value", "Lvab;", "getMTextFieldValue$ui_release", "()Lvab;", "setMTextFieldValue$ui_release", "(Lvab;)V", "mTextFieldValue", e.a, "currentExtractedTextRequestToken", "f", "extractedTextMonitorMode", "", "g", "Ljava/util/List;", "editCommands", Image.TYPE_HIGH, "isActive", "initState", "<init>", "(Lvab;Lo35;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j99  reason: default package */
/* loaded from: classes.dex */
public final class j99 implements InputConnection {
    private final o35 a;
    private final boolean b;
    private int c;
    private vab d;
    private int e;
    private boolean f;
    private final List<ad3> g;
    private boolean h;

    public j99(vab vabVar, o35 o35Var, boolean z) {
        z65.h(vabVar, "initState");
        z65.h(o35Var, "eventCallback");
        this.a = o35Var;
        this.b = z;
        this.d = vabVar;
        this.g = new ArrayList();
        this.h = true;
    }

    private final void a(ad3 ad3Var) {
        b();
        try {
            this.g.add(ad3Var);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.c++;
        return true;
    }

    private final boolean c() {
        List<? extends ad3> I0;
        int i = this.c - 1;
        this.c = i;
        if (i == 0 && (!this.g.isEmpty())) {
            o35 o35Var = this.a;
            I0 = sc1.I0(this.g);
            o35Var.d(I0);
            this.g.clear();
        }
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    private final void d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.h;
        if (z) {
            return b();
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        this.a.a(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        z65.h(inputContentInfo, "inputContentInfo");
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.h;
        if (z) {
            return this.b;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new lj1(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new hu2(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new iu2(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.h;
        if (z) {
            a(new hv3());
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.d.c(), jcb.i(this.d.b()), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.e = i2;
        }
        return w35.a(this.d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        if (jcb.f(this.d.b())) {
            return null;
        }
        return yab.a(this.d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        return yab.b(this.d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return yab.c(this.d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.h;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    a(new ofa(0, this.d.c().length()));
                    break;
                case 16908320:
                    d(277);
                    break;
                case 16908321:
                    d(278);
                    break;
                case 16908322:
                    d(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int a;
        boolean z = this.h;
        if (z) {
            if (i != 0) {
                switch (i) {
                    case 2:
                        a = qw4.b.c();
                        break;
                    case 3:
                        a = qw4.b.g();
                        break;
                    case 4:
                        a = qw4.b.h();
                        break;
                    case 5:
                        a = qw4.b.d();
                        break;
                    case 6:
                        a = qw4.b.b();
                        break;
                    case 7:
                        a = qw4.b.f();
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        a = qw4.b.a();
                        break;
                }
            } else {
                a = qw4.b.a();
            }
            this.a.c(a);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z = this.h;
        if (z) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        z65.h(keyEvent, "event");
        boolean z = this.h;
        if (z) {
            this.a.b(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new ifa(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new jfa(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new ofa(i, i2));
            return true;
        }
        return z;
    }
}
