package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.v;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.en5;
import defpackage.q24;
import defpackage.re5;
import defpackage.s67;
import defpackage.sm6;
import defpackage.t35;
import defpackage.um7;
import defpackage.vi;
import defpackage.w24;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000î\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u009a\u0003\b\u0001\u0018\u0000 Ï\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u000f\u0010B\u001d\u0012\b\u0010Ì\u0003\u001a\u00030Ë\u0003\u0012\b\u0010\u008c\u0003\u001a\u00030\u0087\u0003¢\u0006\u0006\bÍ\u0003\u0010Î\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u0014\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\tH\u0002J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J \u0010%\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010!J*\u0010*\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u0007H\u0002J\b\u0010/\u001a\u00020\fH\u0002J\u0010\u00100\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u00101\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u001a\u00105\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0002J\u0010\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016J\"\u0010?\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u000e2\b\u0010>\u001a\u0004\u0018\u000106H\u0014J\u0010\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\fH\u0016J\u0010\u0010C\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020BH\u0016J\u0010\u0010D\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020BH\u0016J\u0010\u0010E\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0006\u0010G\u001a\u00020\u0007J\b\u0010H\u001a\u00020\u0007H\u0016J\u0016\u0010K\u001a\u00020\u00072\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070IH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\fH\u0016J\u0018\u0010O\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\fH\u0016J(\u0010R\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\f2\u0006\u0010P\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\fH\u0016J \u0010S\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\f2\u0006\u0010P\u001a\u00020\fH\u0016J\u0010\u0010T\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\tH\u0016J\u0018\u0010W\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000eH\u0014J0\u0010\\\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014J\u0010\u0010_\u001a\u00020\u00072\u0006\u0010^\u001a\u00020]H\u0014J*\u0010e\u001a\u00020d2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00070`2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00070IH\u0016J\u0017\u0010g\u001a\u00020\f2\u0006\u0010f\u001a\u00020dH\u0000¢\u0006\u0004\bg\u0010hJ\b\u0010i\u001a\u00020\u0007H\u0016J\u0010\u0010j\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\tH\u0016J\u0010\u0010l\u001a\u00020\u00072\u0006\u0010J\u001a\u00020kH\u0016J\u001f\u0010p\u001a\u0004\u0018\u00010o2\u0006\u0010n\u001a\u00020mH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u00020\u00072\u0006\u0010^\u001a\u00020]H\u0014J\u001f\u0010t\u001a\u00020\u00072\u0006\u0010f\u001a\u00020d2\u0006\u0010s\u001a\u00020\fH\u0000¢\u0006\u0004\bt\u0010uJ\u001a\u0010x\u001a\u00020\u00072\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u00070`J\u0013\u0010y\u001a\u00020\u0007H\u0086@ø\u0001\u0002¢\u0006\u0004\by\u0010zJ\b\u0010{\u001a\u00020\u0007H\u0016J\b\u0010|\u001a\u00020\u0007H\u0014J\b\u0010}\u001a\u00020\u0007H\u0014J\u001c\u0010\u0081\u0001\u001a\u00020\u00072\b\u0010\u007f\u001a\u0004\u0018\u00010~2\u0007\u0010\u0080\u0001\u001a\u00020\u000eH\u0016J\u001a\u0010\u0085\u0001\u001a\u00020\u00072\u000f\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u0001H\u0016J\u0011\u0010\u0086\u0001\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0011\u0010\u0087\u0001\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0011\u0010\u0088\u0001\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u000eH\u0016J\u0011\u0010\u0089\u0001\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u000eH\u0016J!\u0010Y\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\bY\u0010\u008c\u0001J#\u0010\u008e\u0001\u001a\u00030\u008a\u00012\b\u0010\u008d\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008c\u0001J\t\u0010\u008f\u0001\u001a\u00020\fH\u0016J\u0016\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0016J!\u0010\u0010\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\b\u0010\u0010\u008c\u0001J\u0013\u0010\u0096\u0001\u001a\u00020\u00072\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0014J\u0012\u0010\u0098\u0001\u001a\u00020\u00072\u0007\u0010\u0097\u0001\u001a\u00020\u000eH\u0016J\u0011\u0010\u0099\u0001\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\u000eJ\t\u0010\u009b\u0001\u001a\u00020\fH\u0016R!\u0010\u009c\u0001\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0017\u0010\u009d\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001f\u0010¢\u0001\u001a\u00030\u009e\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bE\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R,\u0010©\u0001\u001a\u00030£\u00012\b\u0010¤\u0001\u001a\u00030£\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u0017\u0010¬\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bl\u0010«\u0001R\u001f\u0010±\u0001\u001a\u00030\u00ad\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bT\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010´\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010³\u0001R\u0018\u0010·\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010¶\u0001R\u0017\u0010¸\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010¶\u0001R\u0017\u0010»\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010º\u0001R\u001e\u0010¿\u0001\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bS\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u001f\u0010Ä\u0001\u001a\u00030À\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bY\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001f\u0010É\u0001\u001a\u00030Å\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\be\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010Ì\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010Ë\u0001R\u001f\u0010Ñ\u0001\u001a\u00030Í\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bH\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001d\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020d0Ò\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010Ó\u0001R!\u0010Õ\u0001\u001a\u000b\u0012\u0004\u0012\u00020d\u0018\u00010Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010Ó\u0001R\u0017\u0010Ö\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\u0012R\u0018\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0017\u0010Ý\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bZ\u0010Ü\u0001R6\u0010ä\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0004\u0012\u00020\u00070`8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R\u001a\u0010è\u0001\u001a\u0005\u0018\u00010å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010ê\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bé\u0001\u0010\u0012R \u0010ð\u0001\u001a\u00030ë\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R \u0010ö\u0001\u001a\u00030ñ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001R \u0010ü\u0001\u001a\u00030÷\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bø\u0001\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001R0\u0010\u0084\u0002\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u001f\n\u0005\bý\u0001\u0010\u0012\u0012\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R\u001c\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0085\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001b\u0010\u008b\u0002\u001a\u0005\u0018\u00010\u0089\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010\u008a\u0002R%\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u008c\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008e\u0002R\u0018\u0010\u0091\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0002\u0010\u0012R\u0018\u0010\u0095\u0002\u001a\u00030\u0092\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0094\u0002R \u0010\u009b\u0002\u001a\u00030\u0096\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\"\u0010\u009e\u0002\u001a\u00030\u009c\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b\u009d\u0002\u0010\u0015R\u0018\u0010¢\u0002\u001a\u00030\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R!\u0010¦\u0002\u001a\u00030£\u00028\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R!\u0010¨\u0002\u001a\u00030£\u00028\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b§\u0002\u0010¥\u0002R0\u0010¯\u0002\u001a\u00020'8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0005\b©\u0002\u0010\u0015\u0012\u0006\b®\u0002\u0010\u0083\u0002\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010\u00ad\u0002R\u0018\u0010±\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0002\u0010\u0012R\"\u0010³\u0002\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b²\u0002\u0010\u0015R\u0018\u0010µ\u0002\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0002\u0010\u0012R7\u0010¼\u0002\u001a\u0004\u0018\u00010v2\t\u0010¤\u0001\u001a\u0004\u0018\u00010v8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¶\u0002\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R\"\u0010À\u0002\u001a\u0004\u0018\u00010v8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0002\u0010¾\u0002\u001a\u0006\b¿\u0002\u0010¹\u0002R'\u0010Â\u0002\u001a\u0010\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u0007\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010ß\u0001R\u0018\u0010Æ\u0002\u001a\u00030Ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u0018\u0010Ê\u0002\u001a\u00030Ç\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0002\u0010É\u0002R\u0018\u0010Î\u0002\u001a\u00030Ë\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R \u0010Ô\u0002\u001a\u00030Ï\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÐ\u0002\u0010Ñ\u0002\u001a\u0006\bÒ\u0002\u0010Ó\u0002R \u0010Ú\u0002\u001a\u00030Õ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÖ\u0002\u0010×\u0002\u001a\u0006\bØ\u0002\u0010Ù\u0002R(\u0010á\u0002\u001a\u00030Û\u00028\u0016X\u0097\u0004¢\u0006\u0018\n\u0006\bÜ\u0002\u0010Ý\u0002\u0012\u0006\bà\u0002\u0010\u0083\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002R5\u0010è\u0002\u001a\u00030â\u00022\b\u0010¤\u0001\u001a\u00030â\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bã\u0002\u0010·\u0002\u001a\u0006\bä\u0002\u0010å\u0002\"\u0006\bæ\u0002\u0010ç\u0002R\u0018\u0010ê\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bé\u0002\u0010\bR5\u0010\u0097\u0001\u001a\u00030ë\u00022\b\u0010¤\u0001\u001a\u00030ë\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bì\u0002\u0010·\u0002\u001a\u0006\bí\u0002\u0010î\u0002\"\u0006\bï\u0002\u0010ð\u0002R \u0010ö\u0002\u001a\u00030ñ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bò\u0002\u0010ó\u0002\u001a\u0006\bô\u0002\u0010õ\u0002R\u0018\u0010ú\u0002\u001a\u00030÷\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0002\u0010ù\u0002R \u0010\u0080\u0003\u001a\u00030û\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bü\u0002\u0010ý\u0002\u001a\u0006\bþ\u0002\u0010ÿ\u0002R \u0010\u0086\u0003\u001a\u00030\u0081\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0003\u0010\u0083\u0003\u001a\u0006\b\u0084\u0003\u0010\u0085\u0003R \u0010\u008c\u0003\u001a\u00030\u0087\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0003\u0010\u0089\u0003\u001a\u0006\b\u008a\u0003\u0010\u008b\u0003R\u001b\u0010\u008f\u0003\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0003\u0010\u008e\u0003R\u0018\u0010\u0091\u0003\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0003\u0010\u0015R\u001e\u0010\u0095\u0003\u001a\t\u0012\u0004\u0012\u00020d0\u0092\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0003\u0010\u0094\u0003R&\u0010\u0099\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010I0\u0096\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0003\u0010\u0098\u0003R\u0018\u0010\u009d\u0003\u001a\u00030\u009a\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0003\u0010\u009c\u0003R\u0018\u0010¡\u0003\u001a\u00030\u009e\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0003\u0010 \u0003R\u0018\u0010£\u0003\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0003\u0010\u0012R\u001d\u0010¦\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070I8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0003\u0010¥\u0003R\u0018\u0010ª\u0003\u001a\u00030§\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0003\u0010©\u0003R\u0018\u0010¬\u0003\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b«\u0003\u0010\u0012R \u0010²\u0003\u001a\u00030\u00ad\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b®\u0003\u0010¯\u0003\u001a\u0006\b°\u0003\u0010±\u0003R\u001c\u0010µ\u0003\u001a\u00020\u000e*\u00030\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0003\u0010´\u0003R\u0017\u0010¸\u0003\u001a\u0002038VX\u0096\u0004¢\u0006\b\u001a\u0006\b¶\u0003\u0010·\u0003R\u0018\u0010¼\u0003\u001a\u00030¹\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0003\u0010»\u0003R\u001a\u0010\u0085\u0001\u001a\u0005\u0018\u00010½\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0003\u0010¿\u0003R\u0018\u0010Â\u0003\u001a\u00030\u0085\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÀ\u0003\u0010Á\u0003R\u0017\u0010Ä\u0003\u001a\u00020'8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0003\u0010«\u0002R\u0017\u0010Æ\u0003\u001a\u00020\f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0003\u0010ÿ\u0001R\u0018\u0010Ê\u0003\u001a\u00030Ç\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÈ\u0003\u0010É\u0003\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ð\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lum7;", "Landroidx/compose/ui/platform/y;", "Lvf8;", "Lpq2;", "viewGroup", "", "I", "Len5;", "nodeToRemeasure", "f0", "", "H", "", "a", "b", "Lopb;", "Z", "(II)J", "measureSpec", "J", "(I)J", "n0", "node", "T", "S", "Landroid/view/MotionEvent;", "event", "P", "motionEvent", "Lvk8;", "O", "(Landroid/view/MotionEvent;)I", "lastEvent", "Q", "V", "j0", "action", "", "eventTime", "forceHover", "k0", "W", "a0", "b0", "c0", "F", "U", "X", "accessibilityId", "Landroid/view/View;", "currentView", "K", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "Lop5;", "owner", "onResume", "gainFocus", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "previouslyFocusedRect", "onFocusChanged", "hasWindowFocus", "onWindowFocusChanged", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "dispatchKeyEventPreIme", com.huawei.hms.opendevice.c.a, "j", "e0", "o", "Lkotlin/Function0;", "listener", "n", "sendPointerUpdate", "layoutNode", "affectsLookahead", "g", "forceRequest", "scheduleMeasureAndLayout", "q", "k", "f", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "r", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Lkotlin/Function1;", "Lqn0;", "drawBlock", "invalidateParentLayer", "Lsm7;", Image.TYPE_MEDIUM, "layer", "d0", "(Lsm7;)Z", "p", "i", "Lum7$b;", com.huawei.hms.push.e.a, "Lbf5;", "keyEvent", "Landroidx/compose/ui/focus/b;", "L", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/b;", "dispatchDraw", "isDirty", "Y", "(Lsm7;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "G", "(Lcv1;)Ljava/lang/Object;", "R", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Ls67;", "localPosition", "(J)J", "positionOnScreen", Image.TYPE_HIGH, "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "layoutDirection", "onRtlPropertiesChanged", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "lastDownPointerPosition", "superclassInitComplete", "Lgn5;", "Lgn5;", "getSharedDrawScope", "()Lgn5;", "sharedDrawScope", "La03;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "La03;", "getDensity", "()La03;", "density", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsModifier", "Lf24;", "Lf24;", "getFocusOwner", "()Lf24;", "focusOwner", "Lb5c;", "Lb5c;", "_windowInfo", "Lsm6;", "Lsm6;", "keyInputModifier", "rotaryInputModifier", "Lun0;", "Lun0;", "canvasHolder", "Len5;", "getRoot", "()Len5;", "root", "Lyn9;", "Lyn9;", "getRootForTest", "()Lyn9;", "rootForTest", "Ldba;", "Ldba;", "getSemanticsOwner", "()Ldba;", "semanticsOwner", "Landroidx/compose/ui/platform/h;", "Landroidx/compose/ui/platform/h;", "accessibilityDelegate", "Ll40;", "Ll40;", "getAutofillTree", "()Ll40;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "postponedDirtyLayers", "isDrawingContent", "Luo6;", Image.TYPE_SMALL, "Luo6;", "motionEventAdapter", "Lae8;", "Lae8;", "pointerInputEventProcessor", "u", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "configurationChangeObserver", "Lke;", "v", "Lke;", "_autofill", "w", "observationClearRequested", "Lxf;", "x", "Lxf;", "getClipboardManager", "()Lxf;", "clipboardManager", "Lce;", "y", "Lce;", "getAccessibilityManager", "()Lce;", "accessibilityManager", "Lwm7;", "z", "Lwm7;", "getSnapshotObserver", "()Lwm7;", "snapshotObserver", "A", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Lmj;", "B", "Lmj;", "_androidViewsHandler", "Lr73;", "Lr73;", "viewLayersContainer", "Lnr1;", "S4", "Lnr1;", "onMeasureConstraints", "T4", "wasMeasuredWithMultipleConstraints", "Lob6;", "U4", "Lob6;", "measureAndLayoutDelegate", "Lxyb;", "V4", "Lxyb;", "getViewConfiguration", "()Lxyb;", "viewConfiguration", "Ls55;", "W4", "globalPosition", "", "X4", "[I", "tmpPositionArray", "Loa6;", "Y4", "[F", "viewToWindowMatrix", "Z4", "windowToViewMatrix", "a5", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "b5", "forceUseMatrixCache", "c5", "windowPosition", "d5", "isRenderNodeCompatible", "e5", "Ler6;", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "_viewTreeOwners", "f5", "Lcua;", "getViewTreeOwners", "viewTreeOwners", "g5", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "h5", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "i5", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "j5", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Lpc8;", "k5", "Lpc8;", "getPlatformTextInputPluginRegistry", "()Lpc8;", "platformTextInputPluginRegistry", "Lqbb;", "l5", "Lqbb;", "getTextInputService", "()Lqbb;", "textInputService", "Lq24$a;", "m5", "Lq24$a;", "getFontLoader", "()Lq24$a;", "getFontLoader$annotations", "fontLoader", "Lw24$b;", "n5", "getFontFamilyResolver", "()Lw24$b;", "setFontFamilyResolver", "(Lw24$b;)V", "fontFamilyResolver", "o5", "currentFontWeightAdjustment", "Lqm5;", "p5", "getLayoutDirection", "()Lqm5;", "setLayoutDirection", "(Lqm5;)V", "Lsm4;", "q5", "Lsm4;", "getHapticFeedBack", "()Lsm4;", "hapticFeedBack", "Lv35;", "r5", "Lv35;", "_inputModeManager", "Lxm6;", "s5", "Lxm6;", "getModifierLocalManager", "()Lxm6;", "modifierLocalManager", "Lucb;", "t5", "Lucb;", "getTextToolbar", "()Lucb;", "textToolbar", "Lkotlin/coroutines/CoroutineContext;", "u5", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "v5", "Landroid/view/MotionEvent;", "previousMotionEvent", "w5", "relayoutTime", "Ld3c;", "x5", "Ld3c;", "layerCache", "Lgr6;", "y5", "Lgr6;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$j", "z5", "Landroidx/compose/ui/platform/AndroidComposeView$j;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "A5", "Ljava/lang/Runnable;", "sendHoverExitEvent", "B5", "hoverExitReceived", "C5", "Lkotlin/jvm/functions/Function0;", "resendMotionEventOnLayout", "Landroidx/compose/ui/platform/o;", "D5", "Landroidx/compose/ui/platform/o;", "matrixToWindow", "E5", "keyboardModifiersRequireUpdate", "Ltd8;", "F5", "Ltd8;", "getPointerIconService", "()Ltd8;", "pointerIconService", "M", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "view", "La5c;", "getWindowInfo", "()La5c;", "windowInfo", "Lo30;", "getAutofill", "()Lo30;", "getAndroidViewsHandler$ui_release", "()Lmj;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lu35;", "getInputModeManager", "()Lu35;", "inputModeManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "G5", "ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements um7, y, vf8, pq2 {
    public static final a G5 = new a(null);
    private static Class<?> H5;
    private static Method I5;
    private boolean A;
    private final Runnable A5;
    private mj B;
    private boolean B5;
    private final Function0<Unit> C5;
    private final o D5;
    private boolean E5;
    private final td8 F5;
    private r73 I;
    private nr1 S4;
    private boolean T4;
    private final ob6 U4;
    private final xyb V4;
    private long W4;
    private final int[] X4;
    private final float[] Y4;
    private final float[] Z4;
    private long a;
    private long a5;
    private boolean b;
    private boolean b5;
    private final gn5 c;
    private long c5;
    private a03 d;
    private boolean d5;
    private final EmptySemanticsElement e;
    private final er6 e5;
    private final f24 f;
    private final cua f5;
    private final b5c g;
    private Function1<? super b, Unit> g5;
    private final sm6 h;
    private final ViewTreeObserver.OnGlobalLayoutListener h5;
    private final sm6 i;
    private final ViewTreeObserver.OnScrollChangedListener i5;
    private final un0 j;
    private final ViewTreeObserver.OnTouchModeChangeListener j5;
    private final en5 k;
    private final pc8 k5;
    private final yn9 l;
    private final qbb l5;
    private final dba m;
    private final q24.a m5;
    private final androidx.compose.ui.platform.h n;
    private final er6 n5;
    private final l40 o;
    private int o5;
    private final List<sm7> p;
    private final er6 p5;
    private List<sm7> q;
    private final sm4 q5;
    private boolean r;
    private final v35 r5;
    private final uo6 s;
    private final xm6 s5;
    private final ae8 t;
    private final ucb t5;
    private Function1<? super Configuration, Unit> u;
    private final CoroutineContext u5;
    private final ke v;
    private MotionEvent v5;
    private boolean w;
    private long w5;
    private final xf x;
    private final d3c<sm7> x5;
    private final ce y;
    private final gr6<Function0<Unit>> y5;
    private final wm7 z;
    private final j z5;

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$a;", "", "", "b", "", "FocusTag", "Ljava/lang/String;", "", "MaximumLayerCacheSize", "I", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        public final boolean b() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.H5 == null) {
                    AndroidComposeView.H5 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.H5;
                    if (cls != null) {
                        method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                    } else {
                        method = null;
                    }
                    AndroidComposeView.I5 = method;
                }
                Method method2 = AndroidComposeView.I5;
                if (method2 != null) {
                    obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "", "Lop5;", "a", "Lop5;", "()Lop5;", "lifecycleOwner", "Lnt9;", "b", "Lnt9;", "()Lnt9;", "savedStateRegistryOwner", "<init>", "(Lop5;Lnt9;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private final op5 a;
        private final nt9 b;

        public b(op5 op5Var, nt9 nt9Var) {
            z65.h(op5Var, "lifecycleOwner");
            z65.h(nt9Var, "savedStateRegistryOwner");
            this.a = op5Var;
            this.b = nt9Var;
        }

        public final op5 a() {
            return this.a;
        }

        public final nt9 b() {
            return this.b;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt35;", "it", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<t35, Boolean> {
        c() {
            super(1);
        }

        public final Boolean a(int i) {
            boolean z;
            t35.a aVar = t35.b;
            if (t35.f(i, aVar.b())) {
                z = AndroidComposeView.this.isInTouchMode();
            } else if (t35.f(i, aVar.a())) {
                if (AndroidComposeView.this.isInTouchMode()) {
                    z = AndroidComposeView.this.requestFocusFromTouch();
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(t35 t35Var) {
            return a(t35Var.i());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<Configuration, Unit> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final void a(Configuration configuration) {
            z65.h(configuration, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            a(configuration);
            return Unit.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "a", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<Function0<? extends Unit>, Unit> {
        e() {
            super(1);
        }

        public final void a(Function0<Unit> function0) {
            z65.h(function0, "it");
            AndroidComposeView.this.n(function0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            a(function0);
            return Unit.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbf5;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<bf5, Boolean> {
        f() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            z65.h(keyEvent, "it");
            androidx.compose.ui.focus.b L = AndroidComposeView.this.L(keyEvent);
            if (L != null && df5.e(ef5.b(keyEvent), df5.a.a())) {
                return Boolean.valueOf(AndroidComposeView.this.getFocusOwner().e(L.o()));
            }
            return Boolean.FALSE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(bf5 bf5Var) {
            return a(bf5Var.f());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnc8;", "factory", "Llc8;", "platformTextInput", "Lmc8;", "a", "(Lnc8;Llc8;)Lmc8;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function2<nc8<?>, lc8, mc8> {
        g() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [mc8] */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final mc8 invoke(nc8<?> nc8Var, lc8 lc8Var) {
            z65.h(nc8Var, "factory");
            z65.h(lc8Var, "platformTextInput");
            return nc8Var.a(lc8Var, AndroidComposeView.this);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$h", "Ltd8;", "Lpd8;", "value", "", "a", "Lpd8;", "currentIcon", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class h implements td8 {
        private pd8 a = pd8.b.a();

        h() {
        }

        @Override // defpackage.td8
        public void a(pd8 pd8Var) {
            if (pd8Var == null) {
                pd8Var = pd8.b.a();
            }
            this.a = pd8Var;
            if (Build.VERSION.SDK_INT >= 24) {
                androidx.compose.ui.platform.k.a.a(AndroidComposeView.this, pd8Var);
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function0<Unit> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MotionEvent motionEvent = AndroidComposeView.this.v5;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.w5 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.z5);
                }
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$j", "Ljava/lang/Runnable;", "", "run", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.v5;
            if (motionEvent != null) {
                boolean z = false;
                if (motionEvent.getToolType(0) == 3) {
                    z = true;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (z) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                } else {
                    i = 7;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.k0(motionEvent, i, androidComposeView.w5, false);
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfo9;", "it", "", "a", "(Lfo9;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class k extends ej5 implements Function1<fo9, Boolean> {
        public static final k a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(fo9 fo9Var) {
            z65.h(fo9Var, "it");
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "command", "b", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class l extends ej5 implements Function1<Function0<? extends Unit>, Unit> {
        l() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 function0) {
            z65.h(function0, "$tmp0");
            function0.invoke();
        }

        public final void b(final Function0<Unit> function0) {
            Looper looper;
            z65.h(function0, "command");
            Handler handler = AndroidComposeView.this.getHandler();
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (looper == Looper.myLooper()) {
                function0.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.l.c(Function0.this);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            b(function0);
            return Unit.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "a", "()Landroidx/compose/ui/platform/AndroidComposeView$b;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class m extends ej5 implements Function0<b> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        super(context);
        ke keVar;
        er6 c2;
        er6 c3;
        int a2;
        o pVar;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(coroutineContext, "coroutineContext");
        s67.a aVar = s67.b;
        this.a = aVar.b();
        this.b = true;
        this.c = new gn5(null, 1, null);
        this.d = pg.a(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.c;
        this.e = emptySemanticsElement;
        this.f = new FocusOwnerImpl(new e());
        this.g = new b5c();
        sm6.a aVar2 = sm6.a;
        sm6 a3 = androidx.compose.ui.input.key.a.a(aVar2, new f());
        this.h = a3;
        sm6 a4 = androidx.compose.ui.input.rotary.a.a(aVar2, k.a);
        this.i = a4;
        this.j = new un0();
        en5 en5Var = new en5(false, 0, 3, null);
        en5Var.h(ao9.b);
        en5Var.f(getDensity());
        en5Var.l(aVar2.f(emptySemanticsElement).f(a4).f(getFocusOwner().h()).f(a3));
        this.k = en5Var;
        this.l = this;
        this.m = new dba(getRoot());
        androidx.compose.ui.platform.h hVar = new androidx.compose.ui.platform.h(this);
        this.n = hVar;
        this.o = new l40();
        this.p = new ArrayList();
        this.s = new uo6();
        this.t = new ae8(getRoot());
        this.u = d.a;
        if (F()) {
            keVar = new ke(this, getAutofillTree());
        } else {
            keVar = null;
        }
        this.v = keVar;
        this.x = new xf(context);
        this.y = new ce(context);
        this.z = new wm7(new l());
        this.U4 = new ob6(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        z65.g(viewConfiguration, "get(context)");
        this.V4 = new ij(viewConfiguration);
        this.W4 = t55.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.X4 = new int[]{0, 0};
        this.Y4 = oa6.c(null, 1, null);
        this.Z4 = oa6.c(null, 1, null);
        this.a5 = -1L;
        this.c5 = aVar.a();
        this.d5 = true;
        c2 = tpa.c(null, null, 2, null);
        this.e5 = c2;
        this.f5 = qpa.b(new m());
        this.h5 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: bg
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.N(AndroidComposeView.this);
            }
        };
        this.i5 = new ViewTreeObserver.OnScrollChangedListener() { // from class: cg
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.h0(AndroidComposeView.this);
            }
        };
        this.j5 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: dg
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.m0(AndroidComposeView.this, z);
            }
        };
        this.k5 = new pc8(new g());
        this.l5 = ((vi.a) getPlatformTextInputPluginRegistry().c(vi.a).a()).b();
        this.m5 = new wg(context);
        this.n5 = qpa.d(b34.a(context), qpa.g());
        Configuration configuration = context.getResources().getConfiguration();
        z65.g(configuration, "context.resources.configuration");
        this.o5 = M(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        z65.g(configuration2, "context.resources.configuration");
        c3 = tpa.c(og.d(configuration2), null, 2, null);
        this.p5 = c3;
        this.q5 = new bc8(this);
        if (isInTouchMode()) {
            a2 = t35.b.b();
        } else {
            a2 = t35.b.a();
        }
        this.r5 = new v35(a2, new c(), null);
        this.s5 = new xm6(this);
        this.t5 = new zi(this);
        this.u5 = coroutineContext;
        this.x5 = new d3c<>();
        this.y5 = new gr6<>(new Function0[16], 0);
        this.z5 = new j();
        this.A5 = new Runnable() { // from class: eg
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.i0(AndroidComposeView.this);
            }
        };
        this.C5 = new i();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            pVar = new q();
        } else {
            pVar = new p();
        }
        this.D5 = pVar;
        setWillNotDraw(false);
        setFocusable(true);
        if (i2 >= 26) {
            androidx.compose.ui.platform.l.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        syb.u0(this, hVar);
        Function1<y, Unit> a5 = y.H4.a();
        if (a5 != null) {
            a5.invoke(this);
        }
        getRoot().s(this);
        if (i2 >= 29) {
            androidx.compose.ui.platform.j.a.a(this);
        }
        this.F5 = new h();
    }

    private final boolean F() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    private final boolean H(en5 en5Var) {
        en5 h0;
        if (!this.T4 && ((h0 = en5Var.h0()) == null || h0.J())) {
            return false;
        }
        return true;
    }

    private final void I(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).o();
            } else if (childAt instanceof ViewGroup) {
                I((ViewGroup) childAt);
            }
        }
    }

    private final long J(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return Z(size, size);
                }
                throw new IllegalStateException();
            }
            return Z(0, Integer.MAX_VALUE);
        }
        return Z(0, size);
    }

    private final View K(int i2, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (z65.c(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    z65.g(childAt, "currentView.getChildAt(i)");
                    View K = K(i2, childAt);
                    if (K != null) {
                        return K;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private final int M(Configuration configuration) {
        int i2;
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = configuration.fontWeightAdjustment;
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(AndroidComposeView androidComposeView) {
        z65.h(androidComposeView, "this$0");
        androidComposeView.n0();
    }

    private final int O(MotionEvent motionEvent) {
        boolean z;
        removeCallbacks(this.z5);
        try {
            b0(motionEvent);
            boolean z2 = true;
            this.b5 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.v5;
            if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                z = true;
            } else {
                z = false;
            }
            if (motionEvent2 != null && Q(motionEvent, motionEvent2)) {
                if (V(motionEvent2)) {
                    this.t.b();
                } else if (motionEvent2.getActionMasked() != 10 && z) {
                    l0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z2 = false;
            }
            if (!z && z2 && actionMasked != 3 && actionMasked != 9 && W(motionEvent)) {
                l0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.v5 = MotionEvent.obtainNoHistory(motionEvent);
            int j0 = j0(motionEvent);
            Trace.endSection();
            return j0;
        } finally {
            this.b5 = false;
        }
    }

    private final boolean P(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f2 = -motionEvent.getAxisValue(26);
        return getFocusOwner().l(new fo9(yyb.d(viewConfiguration, getContext()) * f2, f2 * yyb.b(viewConfiguration, getContext()), motionEvent.getEventTime()));
    }

    private final boolean Q(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private final void S(en5 en5Var) {
        en5Var.x0();
        gr6<en5> o0 = en5Var.o0();
        int s = o0.s();
        if (s > 0) {
            en5[] r = o0.r();
            int i2 = 0;
            do {
                S(r[i2]);
                i2++;
            } while (i2 < s);
        }
    }

    private final void T(en5 en5Var) {
        int i2 = 0;
        ob6.E(this.U4, en5Var, false, 2, null);
        gr6<en5> o0 = en5Var.o0();
        int s = o0.s();
        if (s > 0) {
            en5[] r = o0.r();
            do {
                T(r[i2]);
                i2++;
            } while (i2 < s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[LOOP:0: B:22:0x004c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EDGE_INSN: B:41:0x0085->B:40:0x0085 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean U(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = 0
            goto L45
        L44:
            r0 = 1
        L45:
            if (r0 != 0) goto L85
            int r1 = r7.getPointerCount()
            r4 = 1
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            androidx.compose.ui.platform.t r0 = androidx.compose.ui.platform.t.a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = 0
            goto L80
        L7f:
            r0 = 1
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.U(android.view.MotionEvent):boolean");
    }

    private final boolean V(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    private final boolean W(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= getWidth() && 0.0f <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    private final boolean X(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.v5) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    private final long Z(int i2, int i3) {
        return opb.g(opb.g(i3) | opb.g(opb.g(i2) << 32));
    }

    private final void a0() {
        if (!this.b5) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.a5) {
                this.a5 = currentAnimationTimeMillis;
                c0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.X4);
                int[] iArr = this.X4;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.X4;
                this.c5 = x67.a(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            }
        }
    }

    private final void b0(MotionEvent motionEvent) {
        this.a5 = AnimationUtils.currentAnimationTimeMillis();
        c0();
        long f2 = oa6.f(this.Y4, x67.a(motionEvent.getX(), motionEvent.getY()));
        this.c5 = x67.a(motionEvent.getRawX() - s67.l(f2), motionEvent.getRawY() - s67.m(f2));
    }

    private final void c0() {
        this.D5.a(this, this.Y4);
        m75.a(this.Y4, this.Z4);
    }

    private final void f0(en5 en5Var) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (en5Var != null) {
                while (en5Var != null && en5Var.Z() == en5.g.InMeasureBlock && H(en5Var)) {
                    en5Var = en5Var.h0();
                }
                if (en5Var == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    static /* synthetic */ void g0(AndroidComposeView androidComposeView, en5 en5Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            en5Var = null;
        }
        androidComposeView.f0(en5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) this.e5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(AndroidComposeView androidComposeView) {
        z65.h(androidComposeView, "this$0");
        androidComposeView.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(AndroidComposeView androidComposeView) {
        z65.h(androidComposeView, "this$0");
        androidComposeView.B5 = false;
        MotionEvent motionEvent = androidComposeView.v5;
        z65.e(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.j0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    private final int j0(MotionEvent motionEvent) {
        zd8 zd8Var;
        if (this.E5) {
            this.E5 = false;
            this.g.a(je8.b(motionEvent.getMetaState()));
        }
        yd8 c2 = this.s.c(motionEvent, this);
        if (c2 != null) {
            List<zd8> b2 = c2.b();
            int size = b2.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    zd8Var = b2.get(size);
                    if (zd8Var.a()) {
                        break;
                    } else if (i2 < 0) {
                        break;
                    } else {
                        size = i2;
                    }
                }
            }
            zd8Var = null;
            zd8 zd8Var2 = zd8Var;
            if (zd8Var2 != null) {
                this.a = zd8Var2.e();
            }
            int a2 = this.t.a(c2, this, W(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !vk8.c(a2)) {
                this.s.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return a2;
            }
            return a2;
        }
        this.t.b();
        return be8.a(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int i3;
        int buttonState;
        long downTime;
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int i5 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i5 = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            i5 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i5 >= 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i6 = pointerCount - i3;
        if (i6 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            pointerPropertiesArr[i7] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            pointerCoordsArr[i8] = new MotionEvent.PointerCoords();
        }
        for (int i9 = 0; i9 < i6; i9++) {
            if (i5 >= 0 && i9 >= i5) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i10 = i4 + i9;
            motionEvent.getPointerProperties(i10, pointerPropertiesArr[i9]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i9];
            motionEvent.getPointerCoords(i10, pointerCoords);
            long l2 = l(x67.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = s67.l(l2);
            pointerCoords.y = s67.m(l2);
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j2;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j2, i2, i6, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        uo6 uo6Var = this.s;
        z65.g(obtain, "event");
        yd8 c2 = uo6Var.c(obtain, this);
        z65.e(c2);
        this.t.a(c2, this, true);
        obtain.recycle();
    }

    static /* synthetic */ void l0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i2, long j2, boolean z, int i3, Object obj) {
        boolean z2;
        if ((i3 & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        androidComposeView.k0(motionEvent, i2, j2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(AndroidComposeView androidComposeView, boolean z) {
        int a2;
        z65.h(androidComposeView, "this$0");
        v35 v35Var = androidComposeView.r5;
        if (z) {
            a2 = t35.b.b();
        } else {
            a2 = t35.b.a();
        }
        v35Var.b(a2);
    }

    private final void n0() {
        getLocationOnScreen(this.X4);
        long j2 = this.W4;
        int c2 = s55.c(j2);
        int d2 = s55.d(j2);
        int[] iArr = this.X4;
        boolean z = false;
        int i2 = iArr[0];
        if (c2 != i2 || d2 != iArr[1]) {
            this.W4 = t55.a(i2, iArr[1]);
            if (c2 != Integer.MAX_VALUE && d2 != Integer.MAX_VALUE) {
                getRoot().O().D().U0();
                z = true;
            }
        }
        this.U4.d(z);
    }

    private void setFontFamilyResolver(w24.b bVar) {
        this.n5.setValue(bVar);
    }

    private void setLayoutDirection(qm5 qm5Var) {
        this.p5.setValue(qm5Var);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.e5.setValue(bVar);
    }

    public final Object G(cv1<? super Unit> cv1Var) {
        Object d2;
        Object A = this.n.A(cv1Var);
        d2 = c75.d();
        if (A == d2) {
            return A;
        }
        return Unit.a;
    }

    public androidx.compose.ui.focus.b L(KeyEvent keyEvent) {
        int e2;
        z65.h(keyEvent, "keyEvent");
        long a2 = ef5.a(keyEvent);
        re5.a aVar = re5.b;
        if (re5.n(a2, aVar.j())) {
            if (ef5.c(keyEvent)) {
                e2 = androidx.compose.ui.focus.b.b.f();
            } else {
                e2 = androidx.compose.ui.focus.b.b.e();
            }
            return androidx.compose.ui.focus.b.i(e2);
        } else if (re5.n(a2, aVar.e())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.b.g());
        } else {
            if (re5.n(a2, aVar.d())) {
                return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.b.d());
            }
            if (re5.n(a2, aVar.f())) {
                return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.b.h());
            }
            if (re5.n(a2, aVar.c())) {
                return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.b.a());
            }
            if (re5.n(a2, aVar.b()) || re5.n(a2, aVar.g()) || re5.n(a2, aVar.i())) {
                return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.b.b());
            }
            if (re5.n(a2, aVar.a()) || re5.n(a2, aVar.h())) {
                return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.b.c());
            }
            return null;
        }
    }

    public void R() {
        S(getRoot());
    }

    public final void Y(sm7 sm7Var, boolean z) {
        z65.h(sm7Var, "layer");
        if (!z) {
            if (!this.r) {
                this.p.remove(sm7Var);
                List<sm7> list = this.q;
                if (list != null) {
                    list.remove(sm7Var);
                }
            }
        } else if (!this.r) {
            this.p.add(sm7Var);
        } else {
            List list2 = this.q;
            if (list2 == null) {
                list2 = new ArrayList();
                this.q = list2;
            }
            list2.add(sm7Var);
        }
    }

    @Override // defpackage.um7
    public void a(boolean z) {
        Function0<Unit> function0;
        if (this.U4.k() || this.U4.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    function0 = this.C5;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                function0 = null;
            }
            if (this.U4.o(function0)) {
                requestLayout();
            }
            ob6.e(this.U4, false, 1, null);
            Unit unit = Unit.a;
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        ke keVar;
        z65.h(sparseArray, "values");
        if (F() && (keVar = this.v) != null) {
            ne.a(keVar, sparseArray);
        }
    }

    @Override // defpackage.um7
    public long b(long j2) {
        a0();
        return oa6.f(this.Y4, j2);
    }

    @Override // defpackage.um7
    public void c(en5 en5Var) {
        z65.h(en5Var, "node");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.n.D(false, i2, this.a);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.n.D(true, i2, this.a);
    }

    public final boolean d0(sm7 sm7Var) {
        boolean z;
        z65.h(sm7Var, "layer");
        if (this.I != null && !v.o.b() && Build.VERSION.SDK_INT < 23 && this.x5.b() >= 10) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.x5.d(sm7Var);
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
        if (!isAttachedToWindow()) {
            S(getRoot());
        }
        tm7.b(this, false, 1, null);
        this.r = true;
        un0 un0Var = this.j;
        Canvas q = un0Var.a().q();
        un0Var.a().r(canvas);
        getRoot().z(un0Var.a());
        un0Var.a().r(q);
        if (!this.p.isEmpty()) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.get(i2).i();
            }
        }
        if (v.o.b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.p.clear();
        this.r = false;
        List<sm7> list = this.q;
        if (list != null) {
            z65.e(list);
            this.p.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        z65.h(motionEvent, "event");
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return P(motionEvent);
            }
            if (!U(motionEvent) && isAttachedToWindow()) {
                return vk8.c(O(motionEvent));
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        z65.h(motionEvent, "event");
        if (this.B5) {
            removeCallbacks(this.A5);
            this.A5.run();
        }
        if (U(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.n.K(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && W(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.v5;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.v5 = MotionEvent.obtainNoHistory(motionEvent);
                    this.B5 = true;
                    post(this.A5);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!X(motionEvent)) {
            return false;
        }
        return vk8.c(O(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        z65.h(keyEvent, "event");
        if (isFocused()) {
            this.g.a(je8.b(keyEvent.getMetaState()));
            if (!getFocusOwner().n(bf5.b(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        z65.h(keyEvent, "event");
        if ((isFocused() && getFocusOwner().f(bf5.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        z65.h(motionEvent, "motionEvent");
        if (this.B5) {
            removeCallbacks(this.A5);
            MotionEvent motionEvent2 = this.v5;
            z65.e(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !Q(motionEvent, motionEvent2)) {
                this.B5 = false;
            } else {
                this.A5.run();
            }
        }
        if (U(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !X(motionEvent)) {
            return false;
        }
        int O = O(motionEvent);
        if (vk8.b(O)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return vk8.c(O);
    }

    @Override // defpackage.um7
    public void e(um7.b bVar) {
        z65.h(bVar, "listener");
        this.U4.s(bVar);
        g0(this, null, 1, null);
    }

    public final void e0() {
        this.w = true;
    }

    @Override // defpackage.um7
    public void f(en5 en5Var) {
        z65.h(en5Var, "layoutNode");
        this.U4.A(en5Var);
        g0(this, null, 1, null);
    }

    public final View findViewByAccessibilityIdTraversal(int i2) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i2));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = K(i2, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // defpackage.um7
    public void g(en5 en5Var, boolean z) {
        z65.h(en5Var, "layoutNode");
        this.U4.h(en5Var, z);
    }

    @Override // defpackage.um7
    public ce getAccessibilityManager() {
        return this.y;
    }

    public final mj getAndroidViewsHandler$ui_release() {
        if (this.B == null) {
            Context context = getContext();
            z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            mj mjVar = new mj(context);
            this.B = mjVar;
            addView(mjVar);
        }
        mj mjVar2 = this.B;
        z65.e(mjVar2);
        return mjVar2;
    }

    @Override // defpackage.um7
    public o30 getAutofill() {
        return this.v;
    }

    @Override // defpackage.um7
    public l40 getAutofillTree() {
        return this.o;
    }

    @Override // defpackage.um7
    public xf getClipboardManager() {
        return this.x;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.u;
    }

    @Override // defpackage.um7
    public CoroutineContext getCoroutineContext() {
        return this.u5;
    }

    @Override // defpackage.um7
    public a03 getDensity() {
        return this.d;
    }

    @Override // defpackage.um7
    public f24 getFocusOwner() {
        return this.f;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        Unit unit;
        int c2;
        int c3;
        int c4;
        int c5;
        z65.h(rect, "rect");
        k99 i2 = getFocusOwner().i();
        if (i2 != null) {
            c2 = la6.c(i2.f());
            rect.left = c2;
            c3 = la6.c(i2.i());
            rect.top = c3;
            c4 = la6.c(i2.g());
            rect.right = c4;
            c5 = la6.c(i2.c());
            rect.bottom = c5;
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // defpackage.um7
    public w24.b getFontFamilyResolver() {
        return (w24.b) this.n5.getValue();
    }

    @Override // defpackage.um7
    public q24.a getFontLoader() {
        return this.m5;
    }

    @Override // defpackage.um7
    public sm4 getHapticFeedBack() {
        return this.q5;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.U4.k();
    }

    @Override // defpackage.um7
    public u35 getInputModeManager() {
        return this.r5;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.a5;
    }

    @Override // android.view.View, android.view.ViewParent, defpackage.um7
    public qm5 getLayoutDirection() {
        return (qm5) this.p5.getValue();
    }

    public long getMeasureIteration() {
        return this.U4.n();
    }

    @Override // defpackage.um7
    public xm6 getModifierLocalManager() {
        return this.s5;
    }

    @Override // defpackage.um7
    public pc8 getPlatformTextInputPluginRegistry() {
        return this.k5;
    }

    @Override // defpackage.um7
    public td8 getPointerIconService() {
        return this.F5;
    }

    public en5 getRoot() {
        return this.k;
    }

    public yn9 getRootForTest() {
        return this.l;
    }

    public dba getSemanticsOwner() {
        return this.m;
    }

    @Override // defpackage.um7
    public gn5 getSharedDrawScope() {
        return this.c;
    }

    @Override // defpackage.um7
    public boolean getShowLayoutBounds() {
        return this.A;
    }

    @Override // defpackage.um7
    public wm7 getSnapshotObserver() {
        return this.z;
    }

    @Override // defpackage.um7
    public qbb getTextInputService() {
        return this.l5;
    }

    @Override // defpackage.um7
    public ucb getTextToolbar() {
        return this.t5;
    }

    @Override // defpackage.um7
    public xyb getViewConfiguration() {
        return this.V4;
    }

    public final b getViewTreeOwners() {
        return (b) this.f5.getValue();
    }

    @Override // defpackage.um7
    public a5c getWindowInfo() {
        return this.g;
    }

    @Override // defpackage.vf8
    public long h(long j2) {
        a0();
        return oa6.f(this.Z4, x67.a(s67.l(j2) - s67.l(this.c5), s67.m(j2) - s67.m(this.c5)));
    }

    @Override // defpackage.um7
    public void i(en5 en5Var) {
        z65.h(en5Var, "layoutNode");
        this.n.k0(en5Var);
    }

    @Override // defpackage.um7
    public void j(en5 en5Var) {
        z65.h(en5Var, "node");
        this.U4.q(en5Var);
        e0();
    }

    @Override // defpackage.um7
    public void k(en5 en5Var, boolean z, boolean z2) {
        z65.h(en5Var, "layoutNode");
        if (z) {
            if (this.U4.w(en5Var, z2)) {
                g0(this, null, 1, null);
            }
        } else if (this.U4.B(en5Var, z2)) {
            g0(this, null, 1, null);
        }
    }

    @Override // defpackage.vf8
    public long l(long j2) {
        a0();
        long f2 = oa6.f(this.Y4, j2);
        return x67.a(s67.l(f2) + s67.l(this.c5), s67.m(f2) + s67.m(this.c5));
    }

    @Override // defpackage.um7
    public sm7 m(Function1<? super qn0, Unit> function1, Function0<Unit> function0) {
        r73 ozbVar;
        z65.h(function1, "drawBlock");
        z65.h(function0, "invalidateParentLayer");
        sm7 c2 = this.x5.c();
        if (c2 != null) {
            c2.d(function1, function0);
            return c2;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.d5) {
            try {
                return new zf9(this, function1, function0);
            } catch (Throwable unused) {
                this.d5 = false;
            }
        }
        if (this.I == null) {
            v.c cVar = v.o;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            if (cVar.b()) {
                Context context = getContext();
                z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                ozbVar = new r73(context);
            } else {
                Context context2 = getContext();
                z65.g(context2, CoreConstants.CONTEXT_SCOPE_VALUE);
                ozbVar = new ozb(context2);
            }
            this.I = ozbVar;
            addView(ozbVar);
        }
        r73 r73Var = this.I;
        z65.e(r73Var);
        return new v(this, r73Var, function1, function0);
    }

    @Override // defpackage.um7
    public void n(Function0<Unit> function0) {
        z65.h(function0, "listener");
        if (!this.y5.n(function0)) {
            this.y5.b(function0);
        }
    }

    @Override // defpackage.um7
    public void o() {
        if (this.w) {
            getSnapshotObserver().a();
            this.w = false;
        }
        mj mjVar = this.B;
        if (mjVar != null) {
            I(mjVar);
        }
        while (this.y5.v()) {
            int s = this.y5.s();
            for (int i2 = 0; i2 < s; i2++) {
                Function0<Unit> function0 = this.y5.r()[i2];
                this.y5.C(i2, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.y5.A(0, s);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        op5 a2;
        androidx.lifecycle.d lifecycle;
        int a3;
        ke keVar;
        super.onAttachedToWindow();
        T(getRoot());
        S(getRoot());
        getSnapshotObserver().j();
        if (F() && (keVar = this.v) != null) {
            h40.a.a(keVar);
        }
        op5 a4 = v0c.a(this);
        nt9 a5 = x0c.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (a4 != null && a5 != null && (a4 != viewTreeOwners.a() || a5 != viewTreeOwners.a()))) {
            if (a4 != null) {
                if (a5 != null) {
                    if (viewTreeOwners != null && (a2 = viewTreeOwners.a()) != null && (lifecycle = a2.getLifecycle()) != null) {
                        lifecycle.d(this);
                    }
                    a4.getLifecycle().a(this);
                    b bVar = new b(a4, a5);
                    set_viewTreeOwners(bVar);
                    Function1<? super b, Unit> function1 = this.g5;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                    this.g5 = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        v35 v35Var = this.r5;
        if (isInTouchMode()) {
            a3 = t35.b.b();
        } else {
            a3 = t35.b.a();
        }
        v35Var.b(a3);
        b viewTreeOwners2 = getViewTreeOwners();
        z65.e(viewTreeOwners2);
        viewTreeOwners2.a().getLifecycle().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.h5);
        getViewTreeObserver().addOnScrollChangedListener(this.i5);
        getViewTreeObserver().addOnTouchModeChangeListener(this.j5);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        if (getPlatformTextInputPluginRegistry().b() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        z65.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.d = pg.a(context);
        if (M(configuration) != this.o5) {
            this.o5 = M(configuration);
            Context context2 = getContext();
            z65.g(context2, CoreConstants.CONTEXT_SCOPE_VALUE);
            setFontFamilyResolver(b34.a(context2));
        }
        this.u.invoke(configuration);
    }

    @Override // defpackage.pq2
    public /* synthetic */ void onCreate(op5 op5Var) {
        oq2.a(this, op5Var);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        z65.h(editorInfo, "outAttrs");
        mc8 b2 = getPlatformTextInputPluginRegistry().b();
        if (b2 != null) {
            return b2.a(editorInfo);
        }
        return null;
    }

    @Override // defpackage.pq2
    public /* synthetic */ void onDestroy(op5 op5Var) {
        oq2.b(this, op5Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ke keVar;
        op5 a2;
        androidx.lifecycle.d lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().k();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a2 = viewTreeOwners.a()) != null && (lifecycle = a2.getLifecycle()) != null) {
            lifecycle.d(this);
        }
        if (F() && (keVar = this.v) != null) {
            h40.a.b(keVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.h5);
        getViewTreeObserver().removeOnScrollChangedListener(this.i5);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.j5);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (z) {
            getFocusOwner().b();
        } else {
            getFocusOwner().k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.U4.o(this.C5);
        this.S4 = null;
        n0();
        if (this.B != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        if (defpackage.nr1.g(r0.s(), r9) == false) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "AndroidOwner:onMeasure"
            android.os.Trace.beginSection(r0)
            boolean r0 = r8.isAttachedToWindow()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L16
            en5 r0 = r8.getRoot()     // Catch: java.lang.Throwable -> L13
            r8.T(r0)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r9 = move-exception
            goto La9
        L16:
            long r0 = r8.J(r9)     // Catch: java.lang.Throwable -> L13
            r9 = 32
            long r2 = r0 >>> r9
            long r2 = defpackage.opb.g(r2)     // Catch: java.lang.Throwable -> L13
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L13
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = defpackage.opb.g(r0)     // Catch: java.lang.Throwable -> L13
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L13
            long r6 = r8.J(r10)     // Catch: java.lang.Throwable -> L13
            long r9 = r6 >>> r9
            long r9 = defpackage.opb.g(r9)     // Catch: java.lang.Throwable -> L13
            int r10 = (int) r9     // Catch: java.lang.Throwable -> L13
            long r4 = r4 & r6
            long r4 = defpackage.opb.g(r4)     // Catch: java.lang.Throwable -> L13
            int r9 = (int) r4     // Catch: java.lang.Throwable -> L13
            long r9 = defpackage.qr1.a(r3, r1, r10, r9)     // Catch: java.lang.Throwable -> L13
            nr1 r0 = r8.S4     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L51
            nr1 r0 = defpackage.nr1.b(r9)     // Catch: java.lang.Throwable -> L13
            r8.S4 = r0     // Catch: java.lang.Throwable -> L13
            r0 = 0
            r8.T4 = r0     // Catch: java.lang.Throwable -> L13
            goto L61
        L51:
            if (r0 != 0) goto L54
            goto L5e
        L54:
            long r0 = r0.s()     // Catch: java.lang.Throwable -> L13
            boolean r0 = defpackage.nr1.g(r0, r9)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L61
        L5e:
            r0 = 1
            r8.T4 = r0     // Catch: java.lang.Throwable -> L13
        L61:
            ob6 r0 = r8.U4     // Catch: java.lang.Throwable -> L13
            r0.F(r9)     // Catch: java.lang.Throwable -> L13
            ob6 r9 = r8.U4     // Catch: java.lang.Throwable -> L13
            r9.p()     // Catch: java.lang.Throwable -> L13
            en5 r9 = r8.getRoot()     // Catch: java.lang.Throwable -> L13
            int r9 = r9.l0()     // Catch: java.lang.Throwable -> L13
            en5 r10 = r8.getRoot()     // Catch: java.lang.Throwable -> L13
            int r10 = r10.K()     // Catch: java.lang.Throwable -> L13
            r8.setMeasuredDimension(r9, r10)     // Catch: java.lang.Throwable -> L13
            mj r9 = r8.B     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto La3
            mj r9 = r8.getAndroidViewsHandler$ui_release()     // Catch: java.lang.Throwable -> L13
            en5 r10 = r8.getRoot()     // Catch: java.lang.Throwable -> L13
            int r10 = r10.l0()     // Catch: java.lang.Throwable -> L13
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r0)     // Catch: java.lang.Throwable -> L13
            en5 r1 = r8.getRoot()     // Catch: java.lang.Throwable -> L13
            int r1 = r1.K()     // Catch: java.lang.Throwable -> L13
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)     // Catch: java.lang.Throwable -> L13
            r9.measure(r10, r0)     // Catch: java.lang.Throwable -> L13
        La3:
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L13
            android.os.Trace.endSection()
            return
        La9:
            android.os.Trace.endSection()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onMeasure(int, int):void");
    }

    @Override // defpackage.pq2
    public /* synthetic */ void onPause(op5 op5Var) {
        oq2.c(this, op5Var);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        ke keVar;
        if (F() && viewStructure != null && (keVar = this.v) != null) {
            ne.b(keVar, viewStructure);
        }
    }

    @Override // defpackage.pq2
    public void onResume(op5 op5Var) {
        z65.h(op5Var, "owner");
        setShowLayoutBounds(G5.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        qm5 e2;
        if (this.b) {
            e2 = og.e(i2);
            setLayoutDirection(e2);
            getFocusOwner().a(e2);
        }
    }

    @Override // defpackage.pq2
    public /* synthetic */ void onStart(op5 op5Var) {
        oq2.e(this, op5Var);
    }

    @Override // defpackage.pq2
    public /* synthetic */ void onStop(op5 op5Var) {
        oq2.f(this, op5Var);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean b2;
        this.g.b(z);
        this.E5 = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (b2 = G5.b())) {
            setShowLayoutBounds(b2);
            R();
        }
    }

    @Override // defpackage.um7
    public void p() {
        this.n.l0();
    }

    @Override // defpackage.um7
    public void q(en5 en5Var, boolean z, boolean z2, boolean z3) {
        z65.h(en5Var, "layoutNode");
        if (z) {
            if (this.U4.y(en5Var, z2) && z3) {
                f0(en5Var);
            }
        } else if (this.U4.D(en5Var, z2) && z3) {
            f0(en5Var);
        }
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        z65.h(function1, "<set-?>");
        this.u = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.a5 = j2;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super b, Unit> function1) {
        z65.h(function1, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.g5 = function1;
        }
    }

    @Override // defpackage.um7
    public void setShowLayoutBounds(boolean z) {
        this.A = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }
}
