package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.b;
import androidx.compose.ui.platform.f;
import androidx.compose.ui.platform.h;
import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d4;
import defpackage.gn9;
import defpackage.rr5;
import defpackage.sm6;
import defpackage.w24;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00ad\u00012\u00020\u0001:\u000e\u0091\u0001±\u0002\u009f\u0001¤\u0001«\u0001±\u0001¸\u0001B\u0013\u0012\b\u0010£\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b¯\u0002\u0010°\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J@\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\u000eH\u0002J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0002J?\u00102\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00022\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u00108\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u000106H\u0002J*\u0010:\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u001a2\b\u00107\u001a\u0004\u0018\u000106H\u0002J\u001c\u0010?\u001a\u0004\u0018\u00010>2\b\u0010;\u001a\u0004\u0018\u00010\t2\u0006\u0010=\u001a\u00020<H\u0002J\u0010\u0010@\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J/\u0010B\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u0002002\b\u00101\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010A\u001a\u00020\u0002H\u0002¢\u0006\u0004\bB\u0010CJ\u0010\u0010F\u001a\u00020\u00132\u0006\u0010E\u001a\u00020DH\u0002J\u001e\u0010I\u001a\u00020\u00132\u0006\u0010E\u001a\u00020D2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020GH\u0002J\b\u0010J\u001a\u00020\u0013H\u0002J\b\u0010K\u001a\u00020\u0013H\u0002J\u0018\u0010N\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u001aH\u0002J\u001e\u0010Q\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00022\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0&H\u0002J\u0010\u0010S\u001a\u00020\u00132\u0006\u0010R\u001a\u00020OH\u0002J\"\u0010V\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\b\u0010U\u001a\u0004\u0018\u00010\u001aH\u0002J\u000e\u0010Y\u001a\u0004\u0018\u00010X*\u00020WH\u0002J\u000e\u0010[\u001a\u0004\u0018\u00010Z*\u00020\tH\u0002J\u001a\u0010^\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u00022\b\u0010]\u001a\u0004\u0018\u00010ZH\u0002J\u0010\u0010_\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u0002H\u0002J\b\u0010`\u001a\u00020\u0013H\u0002J\u0010\u0010a\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0018\u0010e\u001a\u00020\u00132\u0006\u0010b\u001a\u00020\t2\u0006\u0010d\u001a\u00020cH\u0002J\u0010\u0010f\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0002H\u0002J(\u0010j\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010g\u001a\u00020\u00022\u0006\u0010h\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0006H\u0002J\u0010\u0010k\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u0002H\u0002J(\u0010o\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010l\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u0006H\u0002J\u0010\u0010p\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010q\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010r\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u001c\u0010t\u001a\u0004\u0018\u00010s2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010g\u001a\u00020\u0002H\u0002J\u0014\u0010u\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002J\u000e\u0010x\u001a\u0004\u0018\u00010w*\u00020vH\u0002J-\u0010}\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00062\u0006\u0010z\u001a\u00020\u00022\u0006\u0010|\u001a\u00020{H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b}\u0010~J@\u0010\u0082\u0001\u001a\u00020\u00062\u000e\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u007f2\u0006\u0010y\u001a\u00020\u00062\u0006\u0010z\u001a\u00020\u00022\u0006\u0010|\u001a\u00020{H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\"\u0010\u0085\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0007\u0010\u0084\u0001\u001a\u00020\tH\u0007J\"\u0010\u0086\u0001\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0010\u0010\u0089\u0001\u001a\u00020\u00062\u0007\u0010+\u001a\u00030\u0088\u0001J&\u0010\u008d\u0001\u001a\u00020\u00022\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\b\u0010\u008c\u0001\u001a\u00030\u008a\u0001H\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0013\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u008f\u0001\u001a\u00020WH\u0016J\u0012\u0010\u0092\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0016\u0010\u0094\u0001\u001a\u00020\u0013H\u0086@ø\u0001\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001a\u0010\u0096\u0001\u001a\u00020\u00132\u0006\u0010E\u001a\u00020DH\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J)\u0010\u009a\u0001\u001a\u00020\u00132\u0015\u0010\u0099\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u0080\u00010\u0098\u0001H\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\"\u0010\u009c\u0001\u001a\u00020\u00132\u0006\u0010b\u001a\u00020\t2\u0006\u0010d\u001a\u00020cH\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001d\u0010£\u0001\u001a\u00030\u009e\u00018\u0006¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R(\u0010©\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b¤\u0001\u0010\u0005\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R(\u0010°\u0001\u001a\u00030ª\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u0012\u0006\b¯\u0001\u0010\u0093\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R)\u0010¶\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010\u008d\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R(\u0010½\u0001\u001a\u00030·\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u0012\u0006\b¼\u0001\u0010\u0093\u0001\u001a\u0006\bº\u0001\u0010»\u0001R(\u0010Ä\u0001\u001a\u00030¾\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u0012\u0006\bÃ\u0001\u0010\u0093\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001RD\u0010É\u0001\u001a-\u0012\u000f\u0012\r Æ\u0001*\u0005\u0018\u00010Å\u00010Å\u0001 Æ\u0001*\u0015\u0012\u000f\u0012\r Æ\u0001*\u0005\u0018\u00010Å\u00010Å\u0001\u0018\u00010&0\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Í\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001a\u0010Ð\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ò\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010\u0005R'\u0010Ö\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000Ó\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R-\u0010Ø\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00020\u0098\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÙ\u0001\u0010\u0005R\u001b\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u001d\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020D0G8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001e\u0010ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010æ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010\u008d\u0001R)\u0010ê\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bç\u0001\u0010\u008d\u0001\u001a\u0006\bè\u0001\u0010³\u0001\"\u0006\bé\u0001\u0010µ\u0001R+\u0010ñ\u0001\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R,\u0010÷\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020Z0ò\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001R%\u0010ú\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020G8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010ß\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R\u001c\u0010ý\u0001\u001a\u0005\u0018\u00010û\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010ü\u0001R6\u0010\u0081\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u0080\u00010\u0098\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b:\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u009b\u0001R\u001f\u0010\u0082\u0002\u001a\b\u0012\u0004\u0012\u00020\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010ß\u0001RF\u0010\u008a\u0002\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0083\u0002j\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0084\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002RF\u0010\u008d\u0002\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0083\u0002j\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0084\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b_\u0010\u0085\u0002\u001a\u0006\b\u008b\u0002\u0010\u0087\u0002\"\u0006\b\u008c\u0002\u0010\u0089\u0002R\u001e\u0010\u0091\u0002\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u000f\n\u0005\b}\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u001f\u0010\u0093\u0002\u001a\u00020\u001a8\u0000X\u0080D¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u008e\u0002\u001a\u0006\b\u0092\u0002\u0010\u0090\u0002R\u0017\u0010\u0096\u0002\u001a\u00030\u0094\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010\u0095\u0002R<\u0010\u009a\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020c0\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0005\b4\u0010þ\u0001\u0012\u0006\b\u0099\u0002\u0010\u0093\u0001\u001a\u0006\b\u0097\u0002\u0010\u0080\u0002\"\u0006\b\u0098\u0002\u0010\u009b\u0001R\u0019\u0010\u009c\u0002\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u009b\u0002R\u0018\u0010\u009d\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010\u008d\u0001R\u0017\u0010 \u0002\u001a\u00030\u009e\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010\u009f\u0002R\u001d\u0010¡\u0002\u001a\b\u0012\u0004\u0012\u00020O0\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010È\u0001R$\u0010¥\u0002\u001a\u000f\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00130¢\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R\u0017\u0010§\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0002\u0010³\u0001R\u0017\u0010©\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010³\u0001R\u0017\u0010«\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0002\u0010³\u0001R\u001f\u0010®\u0002\u001a\u00020\u00068@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u00ad\u0002\u0010\u0093\u0001\u001a\u0006\b¬\u0002\u0010³\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006²\u0002"}, d2 = {"Landroidx/compose/ui/platform/h;", "Ls2;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "I", "", "layoutIsRtl", "Ljava/util/Comparator;", "Laba;", "Lkotlin/Comparator;", "u0", "", "parentListToSort", "", "containerChildrenMapping", "P0", "listToSort", "R0", "", "O0", "node", "f0", "Ld4;", "info", "K0", "", "T", "M0", "S", "L0", "Landroid/text/SpannableString;", "U", "N0", "a0", "t0", "eventType", "contentChangeType", "", "contentDescription", "B0", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "A0", "fromIndex", "toIndex", "itemCount", "", "text", "J", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "G", "action", "Landroid/os/Bundle;", "arguments", "m0", "extraDataKey", "z", "textNode", "Lk99;", "bounds", "Landroid/graphics/RectF;", "T0", "Y0", "size", "X0", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Len5;", "layoutNode", "i0", "Lqr;", "subtreeChangedSemanticsNodesIds", "H0", "F", "Z0", "id", "newText", "z0", "Lpx9;", "oldScrollObservationScopes", "s0", "scrollObservationScope", "F0", "semanticsNodeId", "title", "D0", "Landroid/view/View;", "Lgt1;", "P", "Lq0c;", "U0", "virtualId", "viewStructure", "B", "C", "h0", "j0", "newNode", "Landroidx/compose/ui/platform/h$h;", "oldNode", "x0", "w0", "granularity", "forward", "extendSelection", "W0", "E0", "start", "end", "traversalMode", "I0", "O", "N", "b0", "Lu2;", "W", "V", "Ltaa;", "Lml;", "X", "vertical", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Ls67;", "position", "D", "(ZIJ)Z", "", "Lcba;", "currentSemanticsNodes", "E", "(Ljava/util/Collection;ZIJ)Z", "semanticsNode", "p0", "H", "(II)Landroid/view/accessibility/AccessibilityEvent;", "Landroid/view/MotionEvent;", "K", "", "x", "y", "Z", "(FF)I", "host", "Lg4;", "b", "l0", "()V", "A", "(Lcv1;)Ljava/lang/Object;", "k0", "(Len5;)V", "", "newSemanticsNodes", "G0", "(Ljava/util/Map;)V", "y0", "(Laba;Landroidx/compose/ui/platform/h$h;)V", "Landroidx/compose/ui/platform/AndroidComposeView;", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "view", com.huawei.hms.push.e.a, "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "hoveredVirtualViewId", "Landroid/view/accessibility/AccessibilityManager;", "f", "Landroid/view/accessibility/AccessibilityManager;", "M", "()Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release$annotations", "accessibilityManager", "g", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", Image.TYPE_HIGH, "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "R", "()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release$annotations", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "i", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Y", "()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release$annotations", "touchExplorationStateListener", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "j", "Ljava/util/List;", "enabledServices", "Landroid/os/Handler;", "k", "Landroid/os/Handler;", "handler", "l", "Lg4;", "nodeProvider", Image.TYPE_MEDIUM, "focusedVirtualViewId", "Lcra;", "n", "Lcra;", "actionIdToLabel", "o", "labelToActionId", "p", "accessibilityCursorPosition", "q", "Ljava/lang/Integer;", "previousTraversedNode", "r", "Lqr;", "subtreeChangedLayoutNodes", "Lrv0;", Image.TYPE_SMALL, "Lrv0;", "boundsUpdateChannel", "t", "currentSemanticsNodesInvalidated", "u", "getContentCaptureForceEnabledForTesting$ui_release", "setContentCaptureForceEnabledForTesting$ui_release", "contentCaptureForceEnabledForTesting", "v", "Lgt1;", "getContentCaptureSession$ui_release", "()Lgt1;", "J0", "(Lgt1;)V", "contentCaptureSession", "Llr;", "w", "Llr;", "getBufferedContentCaptureAppearedNodes$ui_release", "()Llr;", "bufferedContentCaptureAppearedNodes", "getBufferedContentCaptureDisappearedNodes$ui_release", "()Lqr;", "bufferedContentCaptureDisappearedNodes", "Landroidx/compose/ui/platform/h$g;", "Landroidx/compose/ui/platform/h$g;", "pendingTextTraversedEvent", "Ljava/util/Map;", "Q", "()Ljava/util/Map;", "setCurrentSemanticsNodes$ui_release", "paneDisplayed", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "getIdToBeforeMap$ui_release", "()Ljava/util/HashMap;", "setIdToBeforeMap$ui_release", "(Ljava/util/HashMap;)V", "idToBeforeMap", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "idToAfterMap", "Ljava/lang/String;", "getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release", "()Ljava/lang/String;", "EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", "getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release", "EXTRA_DATA_TEST_TRAVERSALAFTER_VAL", "Lspb;", "Lspb;", "urlSpanCache", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsNodes", "Landroidx/compose/ui/platform/h$h;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "scrollObservationScopes", "Lkotlin/Function1;", "L", "Lkotlin/jvm/functions/Function1;", "sendScrollEventIfNeededLambda", "d0", "isEnabledForAccessibility", "e0", "isEnabledForContentCapture", "g0", "isTouchExplorationEnabled", "c0", "isEnabled$ui_release$annotations", "isEnabled", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", com.huawei.hms.opendevice.c.a, "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class h extends s2 {
    public static final e M = new e(null);
    private static final int[] N = {ly8.a, ly8.b, ly8.m, ly8.x, ly8.A, ly8.B, ly8.C, ly8.D, ly8.E, ly8.F, ly8.c, ly8.d, ly8.e, ly8.f, ly8.g, ly8.h, ly8.i, ly8.j, ly8.k, ly8.l, ly8.n, ly8.o, ly8.p, ly8.q, ly8.r, ly8.s, ly8.t, ly8.u, ly8.v, ly8.w, ly8.y, ly8.z};
    private qr<Integer> A;
    private HashMap<Integer, Integer> B;
    private HashMap<Integer, Integer> C;
    private final String D;
    private final String E;
    private final spb F;
    private Map<Integer, C0023h> G;
    private C0023h H;
    private boolean I;
    private final Runnable J;
    private final List<px9> K;
    private final Function1<px9, Unit> L;
    private final AndroidComposeView d;
    private int e;
    private final AccessibilityManager f;
    private boolean g;
    private final AccessibilityManager.AccessibilityStateChangeListener h;
    private final AccessibilityManager.TouchExplorationStateChangeListener i;
    private List<AccessibilityServiceInfo> j;
    private final Handler k;
    private g4 l;
    private int m;
    private cra<cra<CharSequence>> n;
    private cra<Map<CharSequence, Integer>> o;
    private int p;
    private Integer q;
    private final qr<en5> r;
    private final rv0<Unit> s;
    private boolean t;
    private boolean u;
    private gt1 v;
    private final lr<Integer, q0c> w;
    private final qr<Integer> x;
    private g y;
    private Map<Integer, cba> z;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/platform/h$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            z65.h(view, "view");
            h.this.M().addAccessibilityStateChangeListener(h.this.R());
            h.this.M().addTouchExplorationStateChangeListener(h.this.Y());
            h hVar = h.this;
            hVar.J0(hVar.P(view));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            z65.h(view, "view");
            h.this.k.removeCallbacks(h.this.J);
            h.this.M().removeAccessibilityStateChangeListener(h.this.R());
            h.this.M().removeTouchExplorationStateChangeListener(h.this.Y());
            h.this.J0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lk99;", "", "Laba;", "it", "", "a", "(Lkotlin/Pair;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a0 extends ej5 implements Function1<Pair<? extends k99, ? extends List<aba>>, Comparable<?>> {
        public static final a0 a = new a0();

        a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(Pair<k99, ? extends List<aba>> pair) {
            z65.h(pair, "it");
            return Float.valueOf(pair.c().c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/h$b;", "", "Ld4;", "info", "Laba;", "semanticsNode", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b {
        public static final b a = new b();

        private b() {
        }

        public static final void a(d4 d4Var, aba abaVar) {
            q2 q2Var;
            z65.h(d4Var, "info");
            z65.h(abaVar, "semanticsNode");
            if (androidx.compose.ui.platform.i.b(abaVar) && (q2Var = (q2) uaa.a(abaVar.u(), saa.a.r())) != null) {
                d4Var.b(new d4.a(16908349, q2Var.b()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/h$c;", "", "Landroid/view/accessibility/AccessibilityEvent;", "event", "", "deltaX", "deltaY", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c {
        public static final c a = new c();

        private c() {
        }

        public static final void a(AccessibilityEvent accessibilityEvent, int i, int i2) {
            z65.h(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/h$d;", "", "Ld4;", "info", "Laba;", "semanticsNode", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class d {
        public static final d a = new d();

        private d() {
        }

        public static final void a(d4 d4Var, aba abaVar) {
            z65.h(d4Var, "info");
            z65.h(abaVar, "semanticsNode");
            if (androidx.compose.ui.platform.i.b(abaVar)) {
                taa u = abaVar.u();
                saa saaVar = saa.a;
                q2 q2Var = (q2) uaa.a(u, saaVar.m());
                if (q2Var != null) {
                    d4Var.b(new d4.a(16908358, q2Var.b()));
                }
                q2 q2Var2 = (q2) uaa.a(abaVar.u(), saaVar.j());
                if (q2Var2 != null) {
                    d4Var.b(new d4.a(16908359, q2Var2.b()));
                }
                q2 q2Var3 = (q2) uaa.a(abaVar.u(), saaVar.k());
                if (q2Var3 != null) {
                    d4Var.b(new d4.a(16908360, q2Var3.b()));
                }
                q2 q2Var4 = (q2) uaa.a(abaVar.u(), saaVar.l());
                if (q2Var4 != null) {
                    d4Var.b(new d4.a(16908361, q2Var4.b()));
                }
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/h$e;", "", "", "AccessibilityActionsResourceIds", "[I", "", "AccessibilityCursorPositionUndefined", "I", "AccessibilitySliderStepsCount", "", "ClassName", "Ljava/lang/String;", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "", "SendRecurringAccessibilityEventsIntervalMillis", "J", "TextClassName", "TextFieldClassName", "TextTraversedEventTimeoutMillis", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/h$f;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createAccessibilityNodeInfo", "action", "Landroid/os/Bundle;", "arguments", "", "performAction", "info", "", "extraDataKey", "", "addExtraDataToAccessibilityNodeInfo", "<init>", "(Landroidx/compose/ui/platform/h;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class f extends AccessibilityNodeProvider {
        public f() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            z65.h(accessibilityNodeInfo, "info");
            z65.h(str, "extraDataKey");
            h.this.z(i, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return h.this.I(i);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return h.this.m0(i, i2, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/h$g;", "", "Laba;", "a", "Laba;", DateTokenConverter.CONVERTER_KEY, "()Laba;", "node", "", "b", "I", "()I", "action", com.huawei.hms.opendevice.c.a, "granularity", "fromIndex", com.huawei.hms.push.e.a, "toIndex", "", "f", "J", "()J", "traverseTime", "<init>", "(Laba;IIIIJ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class g {
        private final aba a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final long f;

        public g(aba abaVar, int i, int i2, int i3, int i4, long j) {
            z65.h(abaVar, "node");
            this.a = abaVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public final aba d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public final long f() {
            return this.f;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/h$h;", "", "", DateTokenConverter.CONVERTER_KEY, "Laba;", "a", "Laba;", "b", "()Laba;", "semanticsNode", "Ltaa;", "Ltaa;", com.huawei.hms.opendevice.c.a, "()Ltaa;", "unmergedConfig", "", "", "Ljava/util/Set;", "()Ljava/util/Set;", "children", "", "Lcba;", "currentSemanticsNodes", "<init>", "(Laba;Ljava/util/Map;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0023h {
        private final aba a;
        private final taa b;
        private final Set<Integer> c;

        public C0023h(aba abaVar, Map<Integer, cba> map) {
            z65.h(abaVar, "semanticsNode");
            z65.h(map, "currentSemanticsNodes");
            this.a = abaVar;
            this.b = abaVar.u();
            this.c = new LinkedHashSet();
            List<aba> r = abaVar.r();
            int size = r.size();
            for (int i = 0; i < size; i++) {
                aba abaVar2 = r.get(i);
                if (map.containsKey(Integer.valueOf(abaVar2.m()))) {
                    this.c.add(Integer.valueOf(abaVar2.m()));
                }
            }
        }

        public final Set<Integer> a() {
            return this.c;
        }

        public final aba b() {
            return this.a;
        }

        public final taa c() {
            return this.b;
        }

        public final boolean d() {
            return this.b.h(eba.a.n());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dib.values().length];
            try {
                iArr[dib.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dib.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dib.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2177, 2210}, m = "boundsUpdatesEventLoop")
    /* loaded from: classes.dex */
    public static final class j extends ev1 {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int f;

        j(cv1<? super j> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return h.this.A(this);
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "K", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class k<T> implements Comparator {
        final /* synthetic */ Comparator a;
        final /* synthetic */ Comparator b;

        public k(Comparator comparator, Comparator comparator2) {
            this.a = comparator;
            this.b = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.a.compare(t, t2);
            if (compare == 0) {
                return this.b.compare(((aba) t).o(), ((aba) t2).o());
            }
            return compare;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class l<T> implements Comparator {
        final /* synthetic */ Comparator a;

        public l(Comparator comparator) {
            this.a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            int compare = this.a.compare(t, t2);
            if (compare == 0) {
                d = mk1.d(Integer.valueOf(((aba) t).m()), Integer.valueOf(((aba) t2).m()));
                return d;
            }
            return compare;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laba;", "it", "", "a", "(Laba;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class m extends ej5 implements Function1<aba, Comparable<?>> {
        public static final m a = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(aba abaVar) {
            z65.h(abaVar, "it");
            return Float.valueOf(abaVar.i().g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laba;", "it", "", "a", "(Laba;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class n extends ej5 implements Function1<aba, Comparable<?>> {
        public static final n a = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(aba abaVar) {
            z65.h(abaVar, "it");
            return Float.valueOf(abaVar.i().i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laba;", "it", "", "a", "(Laba;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class o extends ej5 implements Function1<aba, Comparable<?>> {
        public static final o a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(aba abaVar) {
            z65.h(abaVar, "it");
            return Float.valueOf(abaVar.i().c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laba;", "it", "", "a", "(Laba;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class p extends ej5 implements Function1<aba, Comparable<?>> {
        public static final p a = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(aba abaVar) {
            z65.h(abaVar, "it");
            return Float.valueOf(abaVar.i().f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laba;", "it", "", "a", "(Laba;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class q extends ej5 implements Function1<aba, Comparable<?>> {
        public static final q a = new q();

        q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(aba abaVar) {
            z65.h(abaVar, "it");
            return Float.valueOf(abaVar.i().f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laba;", "it", "", "a", "(Laba;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class r extends ej5 implements Function1<aba, Comparable<?>> {
        public static final r a = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(aba abaVar) {
            z65.h(abaVar, "it");
            return Float.valueOf(abaVar.i().i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laba;", "it", "", "a", "(Laba;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class s extends ej5 implements Function1<aba, Comparable<?>> {
        public static final s a = new s();

        s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(aba abaVar) {
            z65.h(abaVar, "it");
            return Float.valueOf(abaVar.i().c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laba;", "it", "", "a", "(Laba;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class t extends ej5 implements Function1<aba, Comparable<?>> {
        public static final t a = new t();

        t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(aba abaVar) {
            z65.h(abaVar, "it");
            return Float.valueOf(abaVar.i().g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class u extends ej5 implements Function0<Unit> {
        final /* synthetic */ px9 a;
        final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(px9 px9Var, h hVar) {
            super(0);
            this.a = px9Var;
            this.b = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nx9 a = this.a.a();
            nx9 e = this.a.e();
            Float b = this.a.b();
            Float c = this.a.c();
            float floatValue = (a == null || b == null) ? 0.0f : a.c().invoke().floatValue() - b.floatValue();
            float floatValue2 = (e == null || c == null) ? 0.0f : e.c().invoke().floatValue() - c.floatValue();
            if (floatValue != 0.0f || floatValue2 != 0.0f) {
                int w0 = this.b.w0(this.a.d());
                h.C0(this.b, w0, 2048, 1, null, 8, null);
                AccessibilityEvent H = this.b.H(w0, 4096);
                if (a != null) {
                    H.setScrollX((int) a.c().invoke().floatValue());
                    H.setMaxScrollX((int) a.a().invoke().floatValue());
                }
                if (e != null) {
                    H.setScrollY((int) e.c().invoke().floatValue());
                    H.setMaxScrollY((int) e.a().invoke().floatValue());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    c.a(H, (int) floatValue, (int) floatValue2);
                }
                this.b.A0(H);
            }
            if (a != null) {
                this.a.g(a.c().invoke());
            }
            if (e != null) {
                this.a.h(e.c().invoke());
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpx9;", "it", "", "a", "(Lpx9;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class v extends ej5 implements Function1<px9, Unit> {
        v() {
            super(1);
        }

        public final void a(px9 px9Var) {
            z65.h(px9Var, "it");
            h.this.F0(px9Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(px9 px9Var) {
            a(px9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "it", "", "a", "(Len5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class w extends ej5 implements Function1<en5, Boolean> {
        public static final w a = new w();

        w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(en5 en5Var) {
            z65.h(en5Var, "it");
            taa F = en5Var.F();
            boolean z = false;
            if (F != null && F.x()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "it", "", "a", "(Len5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class x extends ej5 implements Function1<en5, Boolean> {
        public static final x a = new x();

        x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(en5 en5Var) {
            z65.h(en5Var, "it");
            return Boolean.valueOf(en5Var.e0().q(qz6.a(8)));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class y<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Float.valueOf(androidx.compose.ui.platform.i.e((aba) t)), Float.valueOf(androidx.compose.ui.platform.i.e((aba) t2)));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lk99;", "", "Laba;", "it", "", "a", "(Lkotlin/Pair;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class z extends ej5 implements Function1<Pair<? extends k99, ? extends List<aba>>, Comparable<?>> {
        public static final z a = new z();

        z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(Pair<k99, ? extends List<aba>> pair) {
            z65.h(pair, "it");
            return Float.valueOf(pair.c().i());
        }
    }

    public h(AndroidComposeView androidComposeView) {
        Map<Integer, cba> h;
        Map h2;
        z65.h(androidComposeView, "view");
        this.d = androidComposeView;
        this.e = Integer.MIN_VALUE;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        z65.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f = accessibilityManager;
        this.h = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: fg
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z2) {
                h.L(h.this, z2);
            }
        };
        this.i = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: gg
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                h.V0(h.this, z2);
            }
        };
        this.j = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.k = new Handler(Looper.getMainLooper());
        this.l = new g4(new f());
        this.m = Integer.MIN_VALUE;
        this.n = new cra<>();
        this.o = new cra<>();
        this.p = -1;
        this.r = new qr<>();
        this.s = bw0.b(-1, null, null, 6, null);
        this.t = true;
        this.w = new lr<>();
        this.x = new qr<>();
        h = g86.h();
        this.z = h;
        this.A = new qr<>();
        this.B = new HashMap<>();
        this.C = new HashMap<>();
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.F = new spb();
        this.G = new LinkedHashMap();
        aba a2 = androidComposeView.getSemanticsOwner().a();
        h2 = g86.h();
        this.H = new C0023h(a2, h2);
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.J = new Runnable() { // from class: hg
            @Override // java.lang.Runnable
            public final void run() {
                h.v0(h.this);
            }
        };
        this.K = new ArrayList();
        this.L = new v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0(AccessibilityEvent accessibilityEvent) {
        if (!d0()) {
            return false;
        }
        return this.d.getParent().requestSendAccessibilityEvent(this.d, accessibilityEvent);
    }

    private final void B(int i2, q0c q0cVar) {
        if (q0cVar == null) {
            return;
        }
        if (this.x.contains(Integer.valueOf(i2))) {
            this.x.remove(Integer.valueOf(i2));
            return;
        }
        this.w.put(Integer.valueOf(i2), q0cVar);
    }

    private final boolean B0(int i2, int i3, Integer num, List<String> list) {
        if (i2 != Integer.MIN_VALUE && c0()) {
            AccessibilityEvent H = H(i2, i3);
            if (num != null) {
                H.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                H.setContentDescription(o8b.d(list, ",", null, null, 0, null, null, 62, null));
            }
            return A0(H);
        }
        return false;
    }

    private final void C(int i2) {
        if (this.w.containsKey(Integer.valueOf(i2))) {
            this.w.remove(Integer.valueOf(i2));
        } else {
            this.x.add(Integer.valueOf(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean C0(h hVar, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return hVar.B0(i2, i3, num, list);
    }

    private final void D0(int i2, int i3, String str) {
        AccessibilityEvent H = H(w0(i2), 32);
        H.setContentChangeTypes(i3);
        if (str != null) {
            H.getText().add(str);
        }
        A0(H);
    }

    private final void E0(int i2) {
        g gVar = this.y;
        if (gVar != null) {
            if (i2 != gVar.d().m()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                AccessibilityEvent H = H(w0(gVar.d().m()), 131072);
                H.setFromIndex(gVar.b());
                H.setToIndex(gVar.e());
                H.setAction(gVar.a());
                H.setMovementGranularity(gVar.c());
                H.getText().add(V(gVar.d()));
                A0(H);
            }
        }
        this.y = null;
    }

    private final void F() {
        x0(this.d.getSemanticsOwner().a(), this.H);
        y0(this.d.getSemanticsOwner().a(), this.H);
        G0(Q());
        Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(px9 px9Var) {
        if (!px9Var.b0()) {
            return;
        }
        this.d.getSnapshotObserver().h(px9Var, this.L, new u(px9Var, this));
    }

    private final boolean G(int i2) {
        if (a0(i2)) {
            this.m = Integer.MIN_VALUE;
            this.d.invalidate();
            C0(this, i2, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    private final void H0(en5 en5Var, qr<Integer> qrVar) {
        taa F;
        en5 d2;
        if (!en5Var.C0() || this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(en5Var)) {
            return;
        }
        if (!en5Var.e0().q(qz6.a(8))) {
            en5Var = androidx.compose.ui.platform.i.d(en5Var, x.a);
        }
        if (en5Var != null && (F = en5Var.F()) != null) {
            if (!F.x() && (d2 = androidx.compose.ui.platform.i.d(en5Var, w.a)) != null) {
                en5Var = d2;
            }
            int j0 = en5Var.j0();
            if (!qrVar.add(Integer.valueOf(j0))) {
                return;
            }
            C0(this, w0(j0), 2048, 1, null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo I(int i2) {
        d.b bVar;
        op5 a2;
        androidx.lifecycle.d lifecycle;
        AndroidComposeView.b viewTreeOwners = this.d.getViewTreeOwners();
        View view = null;
        if (viewTreeOwners != null && (a2 = viewTreeOwners.a()) != null && (lifecycle = a2.getLifecycle()) != null) {
            bVar = lifecycle.b();
        } else {
            bVar = null;
        }
        if (bVar == d.b.DESTROYED) {
            return null;
        }
        d4 Z = d4.Z();
        z65.g(Z, "obtain()");
        cba cbaVar = Q().get(Integer.valueOf(i2));
        if (cbaVar == null) {
            return null;
        }
        aba b2 = cbaVar.b();
        int i3 = -1;
        if (i2 == -1) {
            ViewParent K = syb.K(this.d);
            if (K instanceof View) {
                view = (View) K;
            }
            Z.J0(view);
        } else if (b2.p() != null) {
            aba p2 = b2.p();
            z65.e(p2);
            int m2 = p2.m();
            if (m2 != this.d.getSemanticsOwner().a().m()) {
                i3 = m2;
            }
            Z.K0(this.d, i3);
        } else {
            throw new IllegalStateException("semanticsNode " + i2 + " has null parent");
        }
        Z.S0(this.d, i2);
        Rect a3 = cbaVar.a();
        long l2 = this.d.l(x67.a(a3.left, a3.top));
        long l3 = this.d.l(x67.a(a3.right, a3.bottom));
        Z.j0(new Rect((int) Math.floor(s67.l(l2)), (int) Math.floor(s67.m(l2)), (int) Math.ceil(s67.l(l3)), (int) Math.ceil(s67.m(l3))));
        p0(i2, Z, b2);
        return Z.c1();
    }

    private final boolean I0(aba abaVar, int i2, int i3, boolean z2) {
        String V;
        Integer num;
        Integer num2;
        taa u2 = abaVar.u();
        saa saaVar = saa.a;
        boolean z3 = false;
        if (u2.h(saaVar.s()) && androidx.compose.ui.platform.i.b(abaVar)) {
            y84 y84Var = (y84) ((q2) abaVar.u().p(saaVar.s())).a();
            if (y84Var == null) {
                return false;
            }
            return ((Boolean) y84Var.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } else if ((i2 == i3 && i3 == this.p) || (V = V(abaVar)) == null) {
            return false;
        } else {
            this.p = (i2 < 0 || i2 != i3 || i3 > V.length()) ? -1 : -1;
            if (V.length() > 0) {
                z3 = true;
            }
            int w0 = w0(abaVar.m());
            Integer num3 = null;
            if (z3) {
                num = Integer.valueOf(this.p);
            } else {
                num = null;
            }
            if (z3) {
                num2 = Integer.valueOf(this.p);
            } else {
                num2 = null;
            }
            if (z3) {
                num3 = Integer.valueOf(V.length());
            }
            A0(J(w0, num, num2, num3, V));
            E0(abaVar.m());
            return true;
        }
    }

    private final AccessibilityEvent J(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent H = H(i2, 8192);
        if (num != null) {
            H.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            H.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            H.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            H.getText().add(charSequence);
        }
        return H;
    }

    private final void K0(aba abaVar, d4 d4Var) {
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        if (u2.h(ebaVar.f())) {
            d4Var.s0(true);
            d4Var.w0((CharSequence) uaa.a(abaVar.u(), ebaVar.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(h hVar, boolean z2) {
        List<AccessibilityServiceInfo> l2;
        z65.h(hVar, "this$0");
        if (!z2) {
            l2 = kc1.l();
        } else {
            l2 = hVar.f.getEnabledAccessibilityServiceList(-1);
        }
        hVar.j = l2;
    }

    private final void L0(aba abaVar, d4 d4Var) {
        d4Var.l0(S(abaVar));
    }

    private final void M0(aba abaVar, d4 d4Var) {
        d4Var.T0(T(abaVar));
    }

    private final int N(aba abaVar) {
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        if (!u2.h(ebaVar.c()) && abaVar.u().h(ebaVar.w())) {
            return jcb.g(((jcb) abaVar.u().p(ebaVar.w())).m());
        }
        return this.p;
    }

    private final void N0(aba abaVar, d4 d4Var) {
        d4Var.U0(U(abaVar));
    }

    private final int O(aba abaVar) {
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        if (!u2.h(ebaVar.c()) && abaVar.u().h(ebaVar.w())) {
            return jcb.j(((jcb) abaVar.u().p(ebaVar.w())).m());
        }
        return this.p;
    }

    private final void O0() {
        aba abaVar;
        List<aba> r2;
        int n2;
        this.B.clear();
        this.C.clear();
        cba cbaVar = Q().get(-1);
        if (cbaVar != null) {
            abaVar = cbaVar.b();
        } else {
            abaVar = null;
        }
        z65.e(abaVar);
        boolean i2 = androidx.compose.ui.platform.i.i(abaVar);
        int i3 = 1;
        r2 = kc1.r(abaVar);
        List<aba> R0 = R0(i2, r2);
        n2 = kc1.n(R0);
        if (1 > n2) {
            return;
        }
        while (true) {
            int m2 = R0.get(i3 - 1).m();
            int m3 = R0.get(i3).m();
            this.B.put(Integer.valueOf(m2), Integer.valueOf(m3));
            this.C.put(Integer.valueOf(m3), Integer.valueOf(m2));
            if (i3 != n2) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gt1 P(View view) {
        uyb.c(view, 1);
        return uyb.b(view);
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x007e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<defpackage.aba> P0(boolean r10, java.util.List<defpackage.aba> r11, java.util.Map<java.lang.Integer, java.util.List<defpackage.aba>> r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = defpackage.ic1.n(r11)
            r2 = 1
            r3 = 0
            if (r1 < 0) goto L35
            r4 = 0
        Le:
            java.lang.Object r5 = r11.get(r4)
            aba r5 = (defpackage.aba) r5
            if (r4 == 0) goto L1c
            boolean r6 = Q0(r0, r5)
            if (r6 != 0) goto L30
        L1c:
            k99 r6 = r5.i()
            kotlin.Pair r7 = new kotlin.Pair
            aba[] r8 = new defpackage.aba[r2]
            r8[r3] = r5
            java.util.List r5 = defpackage.ic1.r(r8)
            r7.<init>(r6, r5)
            r0.add(r7)
        L30:
            if (r4 == r1) goto L35
            int r4 = r4 + 1
            goto Le
        L35:
            r11 = 2
            kotlin.jvm.functions.Function1[] r11 = new kotlin.jvm.functions.Function1[r11]
            androidx.compose.ui.platform.h$z r1 = androidx.compose.ui.platform.h.z.a
            r11[r3] = r1
            androidx.compose.ui.platform.h$a0 r1 = androidx.compose.ui.platform.h.a0.a
            r11[r2] = r1
            java.util.Comparator r11 = defpackage.kk1.b(r11)
            defpackage.ic1.B(r0, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r0.size()
            r4 = 0
        L51:
            if (r4 >= r1) goto L72
            java.lang.Object r5 = r0.get(r4)
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r6 = r5.d()
            java.util.List r6 = (java.util.List) r6
            java.util.Comparator r7 = r9.u0(r10)
            defpackage.ic1.B(r6, r7)
            java.lang.Object r5 = r5.d()
            java.util.Collection r5 = (java.util.Collection) r5
            r11.addAll(r5)
            int r4 = r4 + 1
            goto L51
        L72:
            androidx.compose.ui.platform.h$y r10 = new androidx.compose.ui.platform.h$y
            r10.<init>()
            defpackage.ic1.B(r11, r10)
        L7a:
            int r10 = defpackage.ic1.n(r11)
            if (r3 > r10) goto Lb2
            java.lang.Object r10 = r11.get(r3)
            aba r10 = (defpackage.aba) r10
            int r10 = r10.m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L9e
            r11.remove(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            r11.addAll(r3, r0)
        L9e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r12.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto Laf
            int r10 = r10.size()
            goto Lb0
        Laf:
            r10 = 1
        Lb0:
            int r3 = r3 + r10
            goto L7a
        Lb2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.h.P0(boolean, java.util.List, java.util.Map):java.util.List");
    }

    private static final boolean Q0(List<Pair<k99, List<aba>>> list, aba abaVar) {
        int n2;
        float i2 = abaVar.i().i();
        float c2 = abaVar.i().c();
        ha7<Float> G = androidx.compose.ui.platform.i.G(i2, c2);
        n2 = kc1.n(list);
        if (n2 >= 0) {
            int i3 = 0;
            while (true) {
                k99 c3 = list.get(i3).c();
                if (androidx.compose.ui.platform.i.m(androidx.compose.ui.platform.i.G(c3.i(), c3.c()), G)) {
                    list.set(i3, new Pair<>(c3.k(new k99(0.0f, i2, Float.POSITIVE_INFINITY, c2)), list.get(i3).d()));
                    list.get(i3).d().add(abaVar);
                    return true;
                } else if (i3 == n2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        return false;
    }

    private final List<aba> R0(boolean z2, List<aba> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            S0(this, arrayList, linkedHashMap, z2, list.get(i2));
        }
        return P0(z2, arrayList, linkedHashMap);
    }

    private final boolean S(aba abaVar) {
        boolean z2;
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        dib dibVar = (dib) uaa.a(u2, ebaVar.x());
        gn9 gn9Var = (gn9) uaa.a(abaVar.u(), ebaVar.q());
        boolean z3 = true;
        if (dibVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = (Boolean) uaa.a(abaVar.u(), ebaVar.s());
        if (bool != null) {
            bool.booleanValue();
            int g2 = gn9.b.g();
            if (gn9Var != null && gn9.k(gn9Var.n(), g2)) {
                z3 = z2;
            }
            return z3;
        }
        return z2;
    }

    private static final void S0(h hVar, List<aba> list, Map<Integer, List<aba>> map, boolean z2, aba abaVar) {
        List<aba> I0;
        Boolean k2 = androidx.compose.ui.platform.i.k(abaVar);
        Boolean bool = Boolean.TRUE;
        if ((z65.c(k2, bool) || hVar.f0(abaVar)) && hVar.Q().keySet().contains(Integer.valueOf(abaVar.m()))) {
            list.add(abaVar);
        }
        if (z65.c(androidx.compose.ui.platform.i.k(abaVar), bool)) {
            Integer valueOf = Integer.valueOf(abaVar.m());
            I0 = sc1.I0(abaVar.j());
            map.put(valueOf, hVar.R0(z2, I0));
            return;
        }
        List<aba> j2 = abaVar.j();
        int size = j2.size();
        for (int i2 = 0; i2 < size; i2++) {
            S0(hVar, list, map, z2, j2.get(i2));
        }
    }

    private final String T(aba abaVar) {
        float b2;
        float k2;
        int i2;
        int c2;
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        Object a2 = uaa.a(u2, ebaVar.t());
        dib dibVar = (dib) uaa.a(abaVar.u(), ebaVar.x());
        gn9 gn9Var = (gn9) uaa.a(abaVar.u(), ebaVar.q());
        if (dibVar != null) {
            int i3 = i.$EnumSwitchMapping$0[dibVar.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3 && a2 == null) {
                        a2 = this.d.getContext().getResources().getString(x09.indeterminate);
                    }
                } else {
                    int f2 = gn9.b.f();
                    if (gn9Var != null && gn9.k(gn9Var.n(), f2) && a2 == null) {
                        a2 = this.d.getContext().getResources().getString(x09.off);
                    }
                }
            } else {
                int f3 = gn9.b.f();
                if (gn9Var != null && gn9.k(gn9Var.n(), f3) && a2 == null) {
                    a2 = this.d.getContext().getResources().getString(x09.on);
                }
            }
        }
        Boolean bool = (Boolean) uaa.a(abaVar.u(), ebaVar.s());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int g2 = gn9.b.g();
            if ((gn9Var == null || !gn9.k(gn9Var.n(), g2)) && a2 == null) {
                if (booleanValue) {
                    a2 = this.d.getContext().getResources().getString(x09.selected);
                } else {
                    a2 = this.d.getContext().getResources().getString(x09.not_selected);
                }
            }
        }
        bp8 bp8Var = (bp8) uaa.a(abaVar.u(), ebaVar.p());
        if (bp8Var != null) {
            if (bp8Var != bp8.d.a()) {
                if (a2 == null) {
                    ca1<Float> c3 = bp8Var.c();
                    if (c3.g().floatValue() - c3.d().floatValue() == 0.0f) {
                        b2 = 0.0f;
                    } else {
                        b2 = (bp8Var.b() - c3.d().floatValue()) / (c3.g().floatValue() - c3.d().floatValue());
                    }
                    k2 = kotlin.ranges.i.k(b2, 0.0f, 1.0f);
                    if (k2 == 0.0f) {
                        i2 = 0;
                    } else {
                        i2 = 100;
                        if (k2 != 1.0f) {
                            c2 = la6.c(k2 * 100);
                            i2 = kotlin.ranges.i.l(c2, 1, 99);
                        }
                    }
                    a2 = this.d.getContext().getResources().getString(x09.template_percent, Integer.valueOf(i2));
                }
            } else if (a2 == null) {
                a2 = this.d.getContext().getResources().getString(x09.in_progress);
            }
        }
        return (String) a2;
    }

    private final RectF T0(aba abaVar, k99 k99Var) {
        k99 k99Var2;
        if (abaVar == null) {
            return null;
        }
        k99 n2 = k99Var.n(abaVar.q());
        k99 h = abaVar.h();
        if (n2.l(h)) {
            k99Var2 = n2.k(h);
        } else {
            k99Var2 = null;
        }
        if (k99Var2 == null) {
            return null;
        }
        long l2 = this.d.l(x67.a(k99Var2.f(), k99Var2.i()));
        long l3 = this.d.l(x67.a(k99Var2.g(), k99Var2.c()));
        return new RectF(s67.l(l2), s67.m(l2), s67.l(l3), s67.m(l3));
    }

    private final SpannableString U(aba abaVar) {
        SpannableString spannableString;
        Object b0;
        w24.b fontFamilyResolver = this.d.getFontFamilyResolver();
        ml X = X(abaVar.u());
        SpannableString spannableString2 = null;
        if (X != null) {
            spannableString = de.b(X, this.d.getDensity(), fontFamilyResolver, this.F);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) X0(spannableString, 100000);
        List list = (List) uaa.a(abaVar.u(), eba.a.v());
        if (list != null) {
            b0 = sc1.b0(list);
            ml mlVar = (ml) b0;
            if (mlVar != null) {
                spannableString2 = de.b(mlVar, this.d.getDensity(), fontFamilyResolver, this.F);
            }
        }
        SpannableString spannableString4 = (SpannableString) X0(spannableString2, 100000);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    private final q0c U0(aba abaVar) {
        j40 a2;
        AutofillId a3;
        String o2;
        gt1 gt1Var = this.v;
        if (gt1Var == null || Build.VERSION.SDK_INT < 29 || (a2 = uyb.a(this.d)) == null) {
            return null;
        }
        aba p2 = abaVar.p();
        if (p2 != null) {
            a3 = gt1Var.a(p2.m());
            if (a3 == null) {
                return null;
            }
        } else {
            a3 = a2.a();
        }
        z65.g(a3, "if (parentNode != null) ….toAutofillId()\n        }");
        q0c b2 = gt1Var.b(a3, abaVar.m());
        if (b2 == null) {
            return null;
        }
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        if (u2.h(ebaVar.o())) {
            return null;
        }
        List list = (List) uaa.a(u2, ebaVar.v());
        if (list != null) {
            b2.a("android.widget.TextView");
            b2.d(o8b.d(list, "\n", null, null, 0, null, null, 62, null));
        }
        ml mlVar = (ml) uaa.a(u2, ebaVar.e());
        if (mlVar != null) {
            b2.a("android.widget.EditText");
            b2.d(mlVar);
        }
        List list2 = (List) uaa.a(u2, ebaVar.c());
        if (list2 != null) {
            b2.b(o8b.d(list2, "\n", null, null, 0, null, null, 62, null));
        }
        gn9 gn9Var = (gn9) uaa.a(u2, ebaVar.q());
        if (gn9Var != null && (o2 = androidx.compose.ui.platform.i.o(gn9Var.n())) != null) {
            b2.a(o2);
        }
        k99 i2 = abaVar.i();
        b2.c((int) i2.f(), (int) i2.i(), 0, 0, (int) i2.j(), (int) i2.e());
        return b2;
    }

    private final String V(aba abaVar) {
        Object b0;
        if (abaVar == null) {
            return null;
        }
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        if (u2.h(ebaVar.c())) {
            return o8b.d((List) abaVar.u().p(ebaVar.c()), ",", null, null, 0, null, null, 62, null);
        }
        if (androidx.compose.ui.platform.i.j(abaVar)) {
            ml X = X(abaVar.u());
            if (X == null) {
                return null;
            }
            return X.h();
        }
        List list = (List) uaa.a(abaVar.u(), ebaVar.v());
        if (list != null) {
            b0 = sc1.b0(list);
            ml mlVar = (ml) b0;
            if (mlVar == null) {
                return null;
            }
            return mlVar.h();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(h hVar, boolean z2) {
        z65.h(hVar, "this$0");
        hVar.j = hVar.f.getEnabledAccessibilityServiceList(-1);
    }

    private final u2 W(aba abaVar, int i2) {
        String V;
        Boolean bool;
        if (abaVar == null || (V = V(abaVar)) == null || V.length() == 0) {
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        if (i2 != 16) {
                            return null;
                        }
                    } else {
                        androidx.compose.ui.platform.e a2 = androidx.compose.ui.platform.e.c.a();
                        a2.e(V);
                        return a2;
                    }
                }
                taa u2 = abaVar.u();
                saa saaVar = saa.a;
                if (!u2.h(saaVar.g())) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Function1 function1 = (Function1) ((q2) abaVar.u().p(saaVar.g())).a();
                if (function1 != null) {
                    bool = (Boolean) function1.invoke(arrayList);
                } else {
                    bool = null;
                }
                if (!z65.c(bool, Boolean.TRUE)) {
                    return null;
                }
                bcb bcbVar = (bcb) arrayList.get(0);
                if (i2 == 4) {
                    androidx.compose.ui.platform.c a3 = androidx.compose.ui.platform.c.d.a();
                    a3.j(V, bcbVar);
                    return a3;
                }
                androidx.compose.ui.platform.d a4 = androidx.compose.ui.platform.d.f.a();
                a4.j(V, bcbVar, abaVar);
                return a4;
            }
            f.a aVar = androidx.compose.ui.platform.f.d;
            Locale locale = this.d.getContext().getResources().getConfiguration().locale;
            z65.g(locale, "view.context.resources.configuration.locale");
            androidx.compose.ui.platform.f a5 = aVar.a(locale);
            a5.e(V);
            return a5;
        }
        b.a aVar2 = androidx.compose.ui.platform.b.d;
        Locale locale2 = this.d.getContext().getResources().getConfiguration().locale;
        z65.g(locale2, "view.context.resources.configuration.locale");
        androidx.compose.ui.platform.b a6 = aVar2.a(locale2);
        a6.e(V);
        return a6;
    }

    private final boolean W0(aba abaVar, int i2, boolean z2, boolean z3) {
        int[] b2;
        int i3;
        int i4;
        int i5;
        int m2 = abaVar.m();
        Integer num = this.q;
        if (num == null || m2 != num.intValue()) {
            this.p = -1;
            this.q = Integer.valueOf(abaVar.m());
        }
        String V = V(abaVar);
        boolean z4 = false;
        if (V != null && V.length() != 0) {
            u2 W = W(abaVar, i2);
            if (W == null) {
                return false;
            }
            int N2 = N(abaVar);
            if (N2 == -1) {
                if (z2) {
                    N2 = 0;
                } else {
                    N2 = V.length();
                }
            }
            if (z2) {
                b2 = W.a(N2);
            } else {
                b2 = W.b(N2);
            }
            if (b2 == null) {
                return false;
            }
            int i6 = b2[0];
            z4 = true;
            int i7 = b2[1];
            if (z3 && b0(abaVar)) {
                i3 = O(abaVar);
                if (i3 == -1) {
                    if (z2) {
                        i3 = i6;
                    } else {
                        i3 = i7;
                    }
                }
                if (z2) {
                    i4 = i7;
                } else {
                    i4 = i6;
                }
            } else {
                if (z2) {
                    i3 = i7;
                } else {
                    i3 = i6;
                }
                i4 = i3;
            }
            if (z2) {
                i5 = 256;
            } else {
                i5 = 512;
            }
            this.y = new g(abaVar, i5, i2, i6, i7, SystemClock.uptimeMillis());
            I0(abaVar, i3, i4, true);
        }
        return z4;
    }

    private final ml X(taa taaVar) {
        return (ml) uaa.a(taaVar, eba.a.e());
    }

    private final <T extends CharSequence> T X0(T t2, int i2) {
        if (i2 > 0) {
            if (t2 != null && t2.length() != 0 && t2.length() > i2) {
                int i3 = i2 - 1;
                if (Character.isHighSurrogate(t2.charAt(i3)) && Character.isLowSurrogate(t2.charAt(i2))) {
                    i2 = i3;
                }
                T t3 = (T) t2.subSequence(0, i2);
                z65.f(t3, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return t3;
            }
            return t2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void Y0(int i2) {
        int i3 = this.e;
        if (i3 == i2) {
            return;
        }
        this.e = i2;
        C0(this, i2, 128, null, null, 12, null);
        C0(this, i3, 256, null, null, 12, null);
    }

    private final void Z0() {
        aba abaVar;
        taa c2;
        qr<? extends Integer> qrVar = new qr<>();
        Iterator<Integer> it = this.A.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            cba cbaVar = Q().get(next);
            String str = null;
            if (cbaVar != null) {
                abaVar = cbaVar.b();
            } else {
                abaVar = null;
            }
            if (abaVar == null || !androidx.compose.ui.platform.i.g(abaVar)) {
                qrVar.add(next);
                z65.g(next, "id");
                int intValue = next.intValue();
                C0023h c0023h = this.G.get(next);
                if (c0023h != null && (c2 = c0023h.c()) != null) {
                    str = (String) uaa.a(c2, eba.a.n());
                }
                D0(intValue, 32, str);
            }
        }
        this.A.p(qrVar);
        this.G.clear();
        for (Map.Entry<Integer, cba> entry : Q().entrySet()) {
            if (androidx.compose.ui.platform.i.g(entry.getValue().b()) && this.A.add(entry.getKey())) {
                D0(entry.getKey().intValue(), 16, (String) entry.getValue().b().u().p(eba.a.n()));
            }
            this.G.put(entry.getKey(), new C0023h(entry.getValue().b(), Q()));
        }
        this.H = new C0023h(this.d.getSemanticsOwner().a(), Q());
    }

    private final boolean a0(int i2) {
        if (this.m == i2) {
            return true;
        }
        return false;
    }

    private final boolean b0(aba abaVar) {
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        if (!u2.h(ebaVar.c()) && abaVar.u().h(ebaVar.e())) {
            return true;
        }
        return false;
    }

    private final boolean d0() {
        if (this.g) {
            return true;
        }
        if (this.f.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.j;
            z65.g(list, "enabledServices");
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean e0() {
        return this.u;
    }

    private final boolean f0(aba abaVar) {
        boolean z2;
        if (androidx.compose.ui.platform.i.f(abaVar) == null && U(abaVar) == null && T(abaVar) == null && !S(abaVar)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (abaVar.u().x()) {
            return true;
        }
        if (abaVar.y() && z2) {
            return true;
        }
        return false;
    }

    private final boolean g0() {
        if (!this.g && (!this.f.isEnabled() || !this.f.isTouchExplorationEnabled())) {
            return false;
        }
        return true;
    }

    private final void h0() {
        List F0;
        long[] G0;
        List F02;
        gt1 gt1Var = this.v;
        if (gt1Var == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (!this.w.isEmpty()) {
            Collection<q0c> values = this.w.values();
            z65.g(values, "bufferedContentCaptureAppearedNodes.values");
            F02 = sc1.F0(values);
            ArrayList arrayList = new ArrayList(F02.size());
            int size = F02.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((q0c) F02.get(i2)).e());
            }
            gt1Var.d(arrayList);
            this.w.clear();
        }
        if (!this.x.isEmpty()) {
            F0 = sc1.F0(this.x);
            ArrayList arrayList2 = new ArrayList(F0.size());
            int size2 = F0.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(Long.valueOf(((Integer) F0.get(i3)).intValue()));
            }
            G0 = sc1.G0(arrayList2);
            gt1Var.e(G0);
            this.x.clear();
        }
    }

    private final void i0(en5 en5Var) {
        if (this.r.add(en5Var)) {
            this.s.h(Unit.a);
        }
    }

    private final void j0(aba abaVar) {
        B(abaVar.m(), U0(abaVar));
        List<aba> r2 = abaVar.r();
        int size = r2.size();
        for (int i2 = 0; i2 < size; i2++) {
            j0(r2.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01a2 -> B:90:0x01a3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m0(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.h.m0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean n0(nx9 nx9Var, float f2) {
        if ((f2 < 0.0f && nx9Var.c().invoke().floatValue() > 0.0f) || (f2 > 0.0f && nx9Var.c().invoke().floatValue() < nx9Var.a().invoke().floatValue())) {
            return true;
        }
        return false;
    }

    private static final float o0(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            if (Math.abs(f2) >= Math.abs(f3)) {
                return f3;
            }
            return f2;
        }
        return 0.0f;
    }

    private static final boolean q0(nx9 nx9Var) {
        if ((nx9Var.c().invoke().floatValue() > 0.0f && !nx9Var.b()) || (nx9Var.c().invoke().floatValue() < nx9Var.a().invoke().floatValue() && nx9Var.b())) {
            return true;
        }
        return false;
    }

    private static final boolean r0(nx9 nx9Var) {
        if ((nx9Var.c().invoke().floatValue() < nx9Var.a().invoke().floatValue() && !nx9Var.b()) || (nx9Var.c().invoke().floatValue() > 0.0f && nx9Var.b())) {
            return true;
        }
        return false;
    }

    private final boolean s0(int i2, List<px9> list) {
        boolean z2;
        px9 s2 = androidx.compose.ui.platform.i.s(list, i2);
        if (s2 != null) {
            z2 = false;
        } else {
            s2 = new px9(i2, this.K, null, null, null, null);
            z2 = true;
        }
        this.K.add(s2);
        return z2;
    }

    private final boolean t0(int i2) {
        if (!g0() || a0(i2)) {
            return false;
        }
        int i3 = this.m;
        if (i3 != Integer.MIN_VALUE) {
            C0(this, i3, 65536, null, null, 12, null);
        }
        this.m = i2;
        this.d.invalidate();
        C0(this, i2, 32768, null, null, 12, null);
        return true;
    }

    private final Comparator<aba> u0(boolean z2) {
        Comparator b2;
        b2 = mk1.b(q.a, r.a, s.a, t.a);
        if (z2) {
            b2 = mk1.b(m.a, n.a, o.a, p.a);
        }
        return new l(new k(b2, en5.V4.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(h hVar) {
        z65.h(hVar, "this$0");
        tm7.b(hVar.d, false, 1, null);
        hVar.F();
        hVar.I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int w0(int i2) {
        if (i2 == this.d.getSemanticsOwner().a().m()) {
            return -1;
        }
        return i2;
    }

    private final void x0(aba abaVar, C0023h c0023h) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<aba> r2 = abaVar.r();
        int size = r2.size();
        for (int i2 = 0; i2 < size; i2++) {
            aba abaVar2 = r2.get(i2);
            if (Q().containsKey(Integer.valueOf(abaVar2.m()))) {
                if (!c0023h.a().contains(Integer.valueOf(abaVar2.m()))) {
                    i0(abaVar.o());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(abaVar2.m()));
            }
        }
        for (Integer num : c0023h.a()) {
            if (!linkedHashSet.contains(Integer.valueOf(num.intValue()))) {
                i0(abaVar.o());
                return;
            }
        }
        List<aba> r3 = abaVar.r();
        int size2 = r3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            aba abaVar3 = r3.get(i3);
            if (Q().containsKey(Integer.valueOf(abaVar3.m()))) {
                C0023h c0023h2 = this.G.get(Integer.valueOf(abaVar3.m()));
                z65.e(c0023h2);
                x0(abaVar3, c0023h2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        aba b2;
        int i3;
        Boolean bool;
        cba cbaVar = Q().get(Integer.valueOf(i2));
        if (cbaVar != null && (b2 = cbaVar.b()) != null) {
            String V = V(b2);
            if (z65.c(str, this.D)) {
                Integer num = this.B.get(Integer.valueOf(i2));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (z65.c(str, this.E)) {
                Integer num2 = this.C.get(Integer.valueOf(i2));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else {
                taa u2 = b2.u();
                saa saaVar = saa.a;
                if (u2.h(saaVar.g()) && bundle != null && z65.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i5 > 0 && i4 >= 0) {
                        if (V != null) {
                            i3 = V.length();
                        } else {
                            i3 = Integer.MAX_VALUE;
                        }
                        if (i4 < i3) {
                            ArrayList arrayList = new ArrayList();
                            Function1 function1 = (Function1) ((q2) b2.u().p(saaVar.g())).a();
                            if (function1 != null) {
                                bool = (Boolean) function1.invoke(arrayList);
                            } else {
                                bool = null;
                            }
                            if (z65.c(bool, Boolean.TRUE)) {
                                bcb bcbVar = (bcb) arrayList.get(0);
                                ArrayList arrayList2 = new ArrayList();
                                for (int i6 = 0; i6 < i5; i6++) {
                                    int i7 = i4 + i6;
                                    if (i7 >= bcbVar.g().c().length()) {
                                        arrayList2.add(null);
                                    } else {
                                        arrayList2.add(T0(b2, bcbVar.a(i7)));
                                    }
                                }
                                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                taa u3 = b2.u();
                eba ebaVar = eba.a;
                if (u3.h(ebaVar.u()) && bundle != null && z65.c(str, "androidx.compose.ui.semantics.testTag")) {
                    String str2 = (String) uaa.a(b2.u(), ebaVar.u());
                    if (str2 != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    }
                } else if (z65.c(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, b2.m());
                }
            }
        }
    }

    private final void z0(int i2, String str) {
        gt1 gt1Var = this.v;
        if (gt1Var == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        AutofillId a2 = gt1Var.a(i2);
        if (a2 != null) {
            gt1Var.c(a2, str);
            return;
        }
        throw new IllegalStateException("Invalid content capture ID".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:34:0x0089, B:36:0x008f, B:38:0x0098, B:39:0x00a9, B:41:0x00b0, B:42:0x00b9, B:20:0x0050), top: B:53:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cc -> B:14:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(defpackage.cv1<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.h.A(cv1):java.lang.Object");
    }

    public final boolean D(boolean z2, int i2, long j2) {
        return E(Q().values(), z2, i2, j2);
    }

    public final boolean E(Collection<cba> collection, boolean z2, int i2, long j2) {
        iba<nx9> i3;
        nx9 nx9Var;
        int i4;
        z65.h(collection, "currentSemanticsNodes");
        if (s67.i(j2, s67.b.b()) || !s67.o(j2)) {
            return false;
        }
        if (z2) {
            i3 = eba.a.z();
        } else if (!z2) {
            i3 = eba.a.i();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Collection<cba> collection2 = collection;
        if (collection2.isEmpty()) {
            return false;
        }
        for (cba cbaVar : collection2) {
            if (n99.a(cbaVar.a()).b(j2) && (nx9Var = (nx9) uaa.a(cbaVar.b().l(), i3)) != null) {
                if (nx9Var.b()) {
                    i4 = -i2;
                } else {
                    i4 = i2;
                }
                if ((i2 == 0 && nx9Var.b()) || i4 < 0) {
                    if (nx9Var.c().invoke().floatValue() > 0.0f) {
                        return true;
                    }
                } else if (nx9Var.c().invoke().floatValue() < nx9Var.a().invoke().floatValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void G0(Map<Integer, cba> map) {
        aba abaVar;
        ml mlVar;
        ml mlVar2;
        Object b0;
        Object b02;
        String str;
        String str2;
        int h;
        boolean z2;
        AccessibilityEvent J;
        String h2;
        Map<Integer, cba> map2 = map;
        z65.h(map2, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.K);
        this.K.clear();
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            C0023h c0023h = this.G.get(Integer.valueOf(intValue));
            if (c0023h != null) {
                cba cbaVar = map2.get(Integer.valueOf(intValue));
                if (cbaVar != null) {
                    abaVar = cbaVar.b();
                } else {
                    abaVar = null;
                }
                z65.e(abaVar);
                Iterator<Map.Entry<? extends iba<?>, ? extends Object>> it = abaVar.u().iterator();
                boolean z3 = false;
                while (it.hasNext()) {
                    Map.Entry<? extends iba<?>, ? extends Object> next = it.next();
                    iba<?> key = next.getKey();
                    eba ebaVar = eba.a;
                    if (((z65.c(key, ebaVar.i()) || z65.c(next.getKey(), ebaVar.z())) && s0(intValue, arrayList)) || !z65.c(next.getValue(), uaa.a(c0023h.c(), next.getKey()))) {
                        iba<?> key2 = next.getKey();
                        if (z65.c(key2, ebaVar.v())) {
                            List list = (List) uaa.a(c0023h.c(), ebaVar.v());
                            if (list != null) {
                                b02 = sc1.b0(list);
                                mlVar = (ml) b02;
                            } else {
                                mlVar = null;
                            }
                            List list2 = (List) uaa.a(abaVar.u(), ebaVar.v());
                            if (list2 != null) {
                                b0 = sc1.b0(list2);
                                mlVar2 = (ml) b0;
                            } else {
                                mlVar2 = null;
                            }
                            if (!z65.c(mlVar, mlVar2)) {
                                z0(abaVar.m(), String.valueOf(mlVar2));
                            }
                        } else if (z65.c(key2, ebaVar.n())) {
                            Object value = next.getValue();
                            z65.f(value, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) value;
                            if (c0023h.d()) {
                                D0(intValue, 8, str3);
                            }
                        } else if (z65.c(key2, ebaVar.t()) || z65.c(key2, ebaVar.x())) {
                            C0(this, w0(intValue), 2048, 64, null, 8, null);
                            C0(this, w0(intValue), 2048, 0, null, 8, null);
                        } else if (z65.c(key2, ebaVar.p())) {
                            C0(this, w0(intValue), 2048, 64, null, 8, null);
                            C0(this, w0(intValue), 2048, 0, null, 8, null);
                        } else if (z65.c(key2, ebaVar.s())) {
                            gn9 gn9Var = (gn9) uaa.a(abaVar.l(), ebaVar.q());
                            int g2 = gn9.b.g();
                            if (gn9Var != null && gn9.k(gn9Var.n(), g2)) {
                                if (z65.c(uaa.a(abaVar.l(), ebaVar.s()), Boolean.TRUE)) {
                                    AccessibilityEvent H = H(w0(intValue), 4);
                                    aba a2 = abaVar.a();
                                    List list3 = (List) uaa.a(a2.l(), ebaVar.c());
                                    if (list3 != null) {
                                        str = o8b.d(list3, ",", null, null, 0, null, null, 62, null);
                                    } else {
                                        str = null;
                                    }
                                    List list4 = (List) uaa.a(a2.l(), ebaVar.v());
                                    if (list4 != null) {
                                        str2 = o8b.d(list4, ",", null, null, 0, null, null, 62, null);
                                    } else {
                                        str2 = null;
                                    }
                                    if (str != null) {
                                        H.setContentDescription(str);
                                    }
                                    if (str2 != null) {
                                        H.getText().add(str2);
                                    }
                                    A0(H);
                                } else {
                                    C0(this, w0(intValue), 2048, 0, null, 8, null);
                                }
                            } else {
                                C0(this, w0(intValue), 2048, 64, null, 8, null);
                                C0(this, w0(intValue), 2048, 0, null, 8, null);
                            }
                        } else if (z65.c(key2, ebaVar.c())) {
                            int w0 = w0(intValue);
                            Object value2 = next.getValue();
                            z65.f(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            B0(w0, 2048, 4, (List) value2);
                        } else {
                            String str4 = "";
                            boolean z4 = true;
                            if (z65.c(key2, ebaVar.e())) {
                                if (androidx.compose.ui.platform.i.j(abaVar)) {
                                    ml X = X(c0023h.c());
                                    if (X == null) {
                                        X = "";
                                    }
                                    ml X2 = X(abaVar.u());
                                    if (X2 != null) {
                                        str4 = X2;
                                    }
                                    CharSequence X0 = X0(str4, 100000);
                                    int length = X.length();
                                    int length2 = str4.length();
                                    h = kotlin.ranges.i.h(length, length2);
                                    int i2 = 0;
                                    while (i2 < h && X.charAt(i2) == str4.charAt(i2)) {
                                        i2++;
                                    }
                                    int i3 = 0;
                                    while (i3 < h - i2) {
                                        int i4 = h;
                                        if (X.charAt((length - 1) - i3) != str4.charAt((length2 - 1) - i3)) {
                                            break;
                                        }
                                        i3++;
                                        h = i4;
                                    }
                                    int i5 = (length - i3) - i2;
                                    int i6 = (length2 - i3) - i2;
                                    if (androidx.compose.ui.platform.i.j(c0023h.b()) && !androidx.compose.ui.platform.i.h(c0023h.b()) && androidx.compose.ui.platform.i.h(abaVar)) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    z4 = (androidx.compose.ui.platform.i.j(c0023h.b()) && androidx.compose.ui.platform.i.h(c0023h.b()) && !androidx.compose.ui.platform.i.h(abaVar)) ? false : false;
                                    if (!z2 && !z4) {
                                        J = H(w0(intValue), 16);
                                        J.setFromIndex(i2);
                                        J.setRemovedCount(i5);
                                        J.setAddedCount(i6);
                                        J.setBeforeText(X);
                                        J.getText().add(X0);
                                    } else {
                                        J = J(w0(intValue), 0, 0, Integer.valueOf(length2), X0);
                                    }
                                    J.setClassName("android.widget.EditText");
                                    A0(J);
                                    if (z2 || z4) {
                                        long m2 = ((jcb) abaVar.u().p(eba.a.w())).m();
                                        J.setFromIndex(jcb.j(m2));
                                        J.setToIndex(jcb.g(m2));
                                        A0(J);
                                    }
                                } else {
                                    C0(this, w0(intValue), 2048, 2, null, 8, null);
                                }
                            } else if (z65.c(key2, ebaVar.w())) {
                                ml X3 = X(abaVar.u());
                                if (X3 != null && (h2 = X3.h()) != null) {
                                    str4 = h2;
                                }
                                long m3 = ((jcb) abaVar.u().p(ebaVar.w())).m();
                                A0(J(w0(intValue), Integer.valueOf(jcb.j(m3)), Integer.valueOf(jcb.g(m3)), Integer.valueOf(str4.length()), X0(str4, 100000)));
                                E0(abaVar.m());
                            } else if (z65.c(key2, ebaVar.i()) || z65.c(key2, ebaVar.z())) {
                                i0(abaVar.o());
                                px9 s2 = androidx.compose.ui.platform.i.s(this.K, intValue);
                                z65.e(s2);
                                s2.f((nx9) uaa.a(abaVar.u(), ebaVar.i()));
                                s2.i((nx9) uaa.a(abaVar.u(), ebaVar.z()));
                                F0(s2);
                            } else if (z65.c(key2, ebaVar.g())) {
                                Object value3 = next.getValue();
                                z65.f(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                if (((Boolean) value3).booleanValue()) {
                                    A0(H(w0(abaVar.m()), 8));
                                }
                                C0(this, w0(abaVar.m()), 2048, 0, null, 8, null);
                            } else {
                                saa saaVar = saa.a;
                                if (z65.c(key2, saaVar.c())) {
                                    List list5 = (List) abaVar.u().p(saaVar.c());
                                    List list6 = (List) uaa.a(c0023h.c(), saaVar.c());
                                    if (list6 != null) {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        int size = list5.size();
                                        for (int i7 = 0; i7 < size; i7++) {
                                            linkedHashSet.add(((t32) list5.get(i7)).b());
                                        }
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                        int size2 = list6.size();
                                        for (int i8 = 0; i8 < size2; i8++) {
                                            linkedHashSet2.add(((t32) list6.get(i8)).b());
                                        }
                                        if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                    } else if (!list5.isEmpty()) {
                                        z3 = true;
                                    }
                                } else if (!(next.getValue() instanceof q2)) {
                                    z3 = true;
                                } else {
                                    Object value4 = next.getValue();
                                    z65.f(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                    z3 = !androidx.compose.ui.platform.i.a((q2) value4, uaa.a(c0023h.c(), next.getKey()));
                                }
                            }
                        }
                    }
                }
                if (!z3) {
                    z3 = androidx.compose.ui.platform.i.n(abaVar, c0023h);
                }
                if (z3) {
                    C0(this, w0(intValue), 2048, 0, null, 8, null);
                }
                map2 = map;
            }
        }
    }

    public final AccessibilityEvent H(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        z65.g(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.d.getContext().getPackageName());
        obtain.setSource(this.d, i2);
        cba cbaVar = Q().get(Integer.valueOf(i2));
        if (cbaVar != null) {
            obtain.setPassword(androidx.compose.ui.platform.i.h(cbaVar.b()));
        }
        return obtain;
    }

    public final void J0(gt1 gt1Var) {
        this.v = gt1Var;
    }

    public final boolean K(MotionEvent motionEvent) {
        z65.h(motionEvent, "event");
        if (!g0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (this.e != Integer.MIN_VALUE) {
                Y0(Integer.MIN_VALUE);
                return true;
            }
            return this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        int Z = Z(motionEvent.getX(), motionEvent.getY());
        boolean dispatchGenericMotionEvent = this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        Y0(Z);
        if (Z != Integer.MIN_VALUE) {
            return true;
        }
        return dispatchGenericMotionEvent;
    }

    public final AccessibilityManager M() {
        return this.f;
    }

    public final Map<Integer, cba> Q() {
        if (this.t) {
            this.t = false;
            this.z = androidx.compose.ui.platform.i.u(this.d.getSemanticsOwner());
            O0();
        }
        return this.z;
    }

    public final AccessibilityManager.AccessibilityStateChangeListener R() {
        return this.h;
    }

    public final AccessibilityManager.TouchExplorationStateChangeListener Y() {
        return this.i;
    }

    public final int Z(float f2, float f3) {
        Object l0;
        mz6 e0;
        en5 en5Var = null;
        tm7.b(this.d, false, 1, null);
        qo4 qo4Var = new qo4();
        en5.s0(this.d.getRoot(), x67.a(f2, f3), qo4Var, false, false, 12, null);
        l0 = sc1.l0(qo4Var);
        sm6.c cVar = (sm6.c) l0;
        if (cVar != null) {
            en5Var = au2.i(cVar);
        }
        if (en5Var != null && (e0 = en5Var.e0()) != null && e0.q(qz6.a(8)) && androidx.compose.ui.platform.i.l(bba.a(en5Var, false)) && this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(en5Var) == null) {
            return w0(en5Var.j0());
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.s2
    public g4 b(View view) {
        z65.h(view, "host");
        return this.l;
    }

    public final boolean c0() {
        if (!d0() && !e0()) {
            return false;
        }
        return true;
    }

    public final void k0(en5 en5Var) {
        z65.h(en5Var, "layoutNode");
        this.t = true;
        if (!c0()) {
            return;
        }
        i0(en5Var);
    }

    public final void l0() {
        this.t = true;
        if (c0() && !this.I) {
            this.I = true;
            this.k.post(this.J);
        }
    }

    public final void p0(int i2, d4 d4Var, aba abaVar) {
        List V;
        Map<CharSequence, Integer> map;
        d4.a aVar;
        d4.a aVar2;
        float d2;
        float g2;
        z65.h(d4Var, "info");
        z65.h(abaVar, "semanticsNode");
        d4Var.n0("android.view.View");
        taa u2 = abaVar.u();
        eba ebaVar = eba.a;
        gn9 gn9Var = (gn9) uaa.a(u2, ebaVar.q());
        if (gn9Var != null) {
            gn9Var.n();
            if (abaVar.v() || abaVar.r().isEmpty()) {
                gn9.a aVar3 = gn9.b;
                if (gn9.k(gn9Var.n(), aVar3.g())) {
                    d4Var.N0(this.d.getContext().getResources().getString(x09.tab));
                } else if (gn9.k(gn9Var.n(), aVar3.f())) {
                    d4Var.N0(this.d.getContext().getResources().getString(x09.switch_role));
                } else {
                    String o2 = androidx.compose.ui.platform.i.o(gn9Var.n());
                    if (!gn9.k(gn9Var.n(), aVar3.d()) || abaVar.y() || abaVar.u().x()) {
                        d4Var.n0(o2);
                    }
                }
            }
            Unit unit = Unit.a;
        }
        if (androidx.compose.ui.platform.i.j(abaVar)) {
            d4Var.n0("android.widget.EditText");
        }
        if (abaVar.l().h(ebaVar.v())) {
            d4Var.n0("android.widget.TextView");
        }
        d4Var.H0(this.d.getContext().getPackageName());
        d4Var.B0(true);
        List<aba> r2 = abaVar.r();
        int size = r2.size();
        for (int i3 = 0; i3 < size; i3++) {
            aba abaVar2 = r2.get(i3);
            if (Q().containsKey(Integer.valueOf(abaVar2.m()))) {
                jj jjVar = this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(abaVar2.o());
                if (jjVar != null) {
                    d4Var.c(jjVar);
                } else {
                    d4Var.d(this.d, abaVar2.m());
                }
            }
        }
        if (this.m == i2) {
            d4Var.g0(true);
            d4Var.b(d4.a.l);
        } else {
            d4Var.g0(false);
            d4Var.b(d4.a.k);
        }
        N0(abaVar, d4Var);
        K0(abaVar, d4Var);
        M0(abaVar, d4Var);
        L0(abaVar, d4Var);
        taa u3 = abaVar.u();
        eba ebaVar2 = eba.a;
        dib dibVar = (dib) uaa.a(u3, ebaVar2.x());
        if (dibVar != null) {
            if (dibVar == dib.On) {
                d4Var.m0(true);
            } else if (dibVar == dib.Off) {
                d4Var.m0(false);
            }
            Unit unit2 = Unit.a;
        }
        Boolean bool = (Boolean) uaa.a(abaVar.u(), ebaVar2.s());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int g3 = gn9.b.g();
            if (gn9Var != null && gn9.k(gn9Var.n(), g3)) {
                d4Var.Q0(booleanValue);
            } else {
                d4Var.m0(booleanValue);
            }
            Unit unit3 = Unit.a;
        }
        if (!abaVar.u().x() || abaVar.r().isEmpty()) {
            d4Var.r0(androidx.compose.ui.platform.i.f(abaVar));
        }
        String str = (String) uaa.a(abaVar.u(), ebaVar2.u());
        if (str != null) {
            aba abaVar3 = abaVar;
            while (true) {
                if (abaVar3 == null) {
                    break;
                }
                taa u4 = abaVar3.u();
                fba fbaVar = fba.a;
                if (u4.h(fbaVar.a())) {
                    if (((Boolean) abaVar3.u().p(fbaVar.a())).booleanValue()) {
                        d4Var.a1(str);
                    }
                } else {
                    abaVar3 = abaVar3.p();
                }
            }
        }
        taa u5 = abaVar.u();
        eba ebaVar3 = eba.a;
        if (((Unit) uaa.a(u5, ebaVar3.h())) != null) {
            d4Var.z0(true);
            Unit unit4 = Unit.a;
        }
        d4Var.L0(androidx.compose.ui.platform.i.h(abaVar));
        d4Var.u0(androidx.compose.ui.platform.i.j(abaVar));
        d4Var.v0(androidx.compose.ui.platform.i.b(abaVar));
        d4Var.x0(abaVar.u().h(ebaVar3.g()));
        if (d4Var.O()) {
            d4Var.y0(((Boolean) abaVar.u().p(ebaVar3.g())).booleanValue());
            if (d4Var.P()) {
                d4Var.a(2);
            } else {
                d4Var.a(1);
            }
        }
        d4Var.b1(androidx.compose.ui.platform.i.l(abaVar));
        rr5 rr5Var = (rr5) uaa.a(abaVar.u(), ebaVar3.m());
        if (rr5Var != null) {
            int h = rr5Var.h();
            rr5.a aVar4 = rr5.b;
            d4Var.D0((rr5.e(h, aVar4.b()) || !rr5.e(h, aVar4.a())) ? 1 : 2);
            Unit unit5 = Unit.a;
        }
        d4Var.o0(false);
        taa u6 = abaVar.u();
        saa saaVar = saa.a;
        q2 q2Var = (q2) uaa.a(u6, saaVar.h());
        if (q2Var != null) {
            boolean c2 = z65.c(uaa.a(abaVar.u(), ebaVar3.s()), Boolean.TRUE);
            d4Var.o0(!c2);
            if (androidx.compose.ui.platform.i.b(abaVar) && !c2) {
                d4Var.b(new d4.a(16, q2Var.b()));
            }
            Unit unit6 = Unit.a;
        }
        d4Var.E0(false);
        q2 q2Var2 = (q2) uaa.a(abaVar.u(), saaVar.i());
        if (q2Var2 != null) {
            d4Var.E0(true);
            if (androidx.compose.ui.platform.i.b(abaVar)) {
                d4Var.b(new d4.a(32, q2Var2.b()));
            }
            Unit unit7 = Unit.a;
        }
        q2 q2Var3 = (q2) uaa.a(abaVar.u(), saaVar.b());
        if (q2Var3 != null) {
            d4Var.b(new d4.a(16384, q2Var3.b()));
            Unit unit8 = Unit.a;
        }
        if (androidx.compose.ui.platform.i.b(abaVar)) {
            q2 q2Var4 = (q2) uaa.a(abaVar.u(), saaVar.t());
            if (q2Var4 != null) {
                d4Var.b(new d4.a(2097152, q2Var4.b()));
                Unit unit9 = Unit.a;
            }
            q2 q2Var5 = (q2) uaa.a(abaVar.u(), saaVar.o());
            if (q2Var5 != null) {
                d4Var.b(new d4.a(16908372, q2Var5.b()));
                Unit unit10 = Unit.a;
            }
            q2 q2Var6 = (q2) uaa.a(abaVar.u(), saaVar.d());
            if (q2Var6 != null) {
                d4Var.b(new d4.a(65536, q2Var6.b()));
                Unit unit11 = Unit.a;
            }
            q2 q2Var7 = (q2) uaa.a(abaVar.u(), saaVar.n());
            if (q2Var7 != null) {
                if (d4Var.P() && this.d.getClipboardManager().a()) {
                    d4Var.b(new d4.a(32768, q2Var7.b()));
                }
                Unit unit12 = Unit.a;
            }
        }
        String V2 = V(abaVar);
        if (V2 != null && V2.length() != 0) {
            d4Var.V0(O(abaVar), N(abaVar));
            q2 q2Var8 = (q2) uaa.a(abaVar.u(), saaVar.s());
            d4Var.b(new d4.a(131072, q2Var8 != null ? q2Var8.b() : null));
            d4Var.a(256);
            d4Var.a(512);
            d4Var.G0(11);
            List list = (List) uaa.a(abaVar.u(), ebaVar3.c());
            if ((list == null || list.isEmpty()) && abaVar.u().h(saaVar.g()) && !androidx.compose.ui.platform.i.c(abaVar)) {
                d4Var.G0(d4Var.w() | 20);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            CharSequence B = d4Var.B();
            if (B != null && B.length() != 0 && abaVar.u().h(saaVar.g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (abaVar.u().h(ebaVar3.u())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            f4 f4Var = f4.a;
            AccessibilityNodeInfo c1 = d4Var.c1();
            z65.g(c1, "info.unwrap()");
            f4Var.a(c1, arrayList);
        }
        bp8 bp8Var = (bp8) uaa.a(abaVar.u(), ebaVar3.p());
        if (bp8Var != null) {
            if (abaVar.u().h(saaVar.r())) {
                d4Var.n0("android.widget.SeekBar");
            } else {
                d4Var.n0("android.widget.ProgressBar");
            }
            if (bp8Var != bp8.d.a()) {
                d4Var.M0(d4.d.a(1, bp8Var.c().d().floatValue(), bp8Var.c().g().floatValue(), bp8Var.b()));
            }
            if (abaVar.u().h(saaVar.r()) && androidx.compose.ui.platform.i.b(abaVar)) {
                float b2 = bp8Var.b();
                d2 = kotlin.ranges.i.d(bp8Var.c().g().floatValue(), bp8Var.c().d().floatValue());
                if (b2 < d2) {
                    d4Var.b(d4.a.q);
                }
                float b3 = bp8Var.b();
                g2 = kotlin.ranges.i.g(bp8Var.c().d().floatValue(), bp8Var.c().g().floatValue());
                if (b3 > g2) {
                    d4Var.b(d4.a.r);
                }
            }
        }
        if (i4 >= 24) {
            b.a(d4Var, abaVar);
        }
        ac1.d(abaVar, d4Var);
        ac1.e(abaVar, d4Var);
        nx9 nx9Var = (nx9) uaa.a(abaVar.u(), ebaVar3.i());
        q2 q2Var9 = (q2) uaa.a(abaVar.u(), saaVar.q());
        if (nx9Var != null && q2Var9 != null) {
            if (!ac1.b(abaVar)) {
                d4Var.n0("android.widget.HorizontalScrollView");
            }
            if (nx9Var.a().invoke().floatValue() > 0.0f) {
                d4Var.P0(true);
            }
            if (androidx.compose.ui.platform.i.b(abaVar)) {
                if (r0(nx9Var)) {
                    d4Var.b(d4.a.q);
                    if (!androidx.compose.ui.platform.i.i(abaVar)) {
                        aVar2 = d4.a.F;
                    } else {
                        aVar2 = d4.a.D;
                    }
                    d4Var.b(aVar2);
                }
                if (q0(nx9Var)) {
                    d4Var.b(d4.a.r);
                    if (!androidx.compose.ui.platform.i.i(abaVar)) {
                        aVar = d4.a.D;
                    } else {
                        aVar = d4.a.F;
                    }
                    d4Var.b(aVar);
                }
            }
        }
        nx9 nx9Var2 = (nx9) uaa.a(abaVar.u(), ebaVar3.z());
        if (nx9Var2 != null && q2Var9 != null) {
            if (!ac1.b(abaVar)) {
                d4Var.n0("android.widget.ScrollView");
            }
            if (nx9Var2.a().invoke().floatValue() > 0.0f) {
                d4Var.P0(true);
            }
            if (androidx.compose.ui.platform.i.b(abaVar)) {
                if (r0(nx9Var2)) {
                    d4Var.b(d4.a.q);
                    d4Var.b(d4.a.E);
                }
                if (q0(nx9Var2)) {
                    d4Var.b(d4.a.r);
                    d4Var.b(d4.a.C);
                }
            }
        }
        if (i4 >= 29) {
            d.a(d4Var, abaVar);
        }
        d4Var.I0((CharSequence) uaa.a(abaVar.u(), ebaVar3.n()));
        if (androidx.compose.ui.platform.i.b(abaVar)) {
            q2 q2Var10 = (q2) uaa.a(abaVar.u(), saaVar.f());
            if (q2Var10 != null) {
                d4Var.b(new d4.a(262144, q2Var10.b()));
                Unit unit13 = Unit.a;
            }
            q2 q2Var11 = (q2) uaa.a(abaVar.u(), saaVar.a());
            if (q2Var11 != null) {
                d4Var.b(new d4.a(524288, q2Var11.b()));
                Unit unit14 = Unit.a;
            }
            q2 q2Var12 = (q2) uaa.a(abaVar.u(), saaVar.e());
            if (q2Var12 != null) {
                d4Var.b(new d4.a(1048576, q2Var12.b()));
                Unit unit15 = Unit.a;
            }
            if (abaVar.u().h(saaVar.c())) {
                List list2 = (List) abaVar.u().p(saaVar.c());
                int size2 = list2.size();
                int[] iArr = N;
                if (size2 < iArr.length) {
                    cra<CharSequence> craVar = new cra<>();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.o.e(i2)) {
                        Map<CharSequence, Integer> g4 = this.o.g(i2);
                        V = yr.V(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            t32 t32Var = (t32) list2.get(i5);
                            z65.e(g4);
                            if (g4.containsKey(t32Var.b())) {
                                Integer num = g4.get(t32Var.b());
                                z65.e(num);
                                map = g4;
                                craVar.m(num.intValue(), t32Var.b());
                                linkedHashMap.put(t32Var.b(), num);
                                V.remove(num);
                                d4Var.b(new d4.a(num.intValue(), t32Var.b()));
                            } else {
                                map = g4;
                                arrayList2.add(t32Var);
                            }
                            i5++;
                            g4 = map;
                        }
                        int size4 = arrayList2.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            t32 t32Var2 = (t32) arrayList2.get(i6);
                            int intValue = ((Number) V.get(i6)).intValue();
                            craVar.m(intValue, t32Var2.b());
                            linkedHashMap.put(t32Var2.b(), Integer.valueOf(intValue));
                            d4Var.b(new d4.a(intValue, t32Var2.b()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i7 = 0; i7 < size5; i7++) {
                            t32 t32Var3 = (t32) list2.get(i7);
                            int i8 = N[i7];
                            craVar.m(i8, t32Var3.b());
                            linkedHashMap.put(t32Var3.b(), Integer.valueOf(i8));
                            d4Var.b(new d4.a(i8, t32Var3.b()));
                        }
                    }
                    this.n.m(i2, craVar);
                    this.o.m(i2, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        d4Var.O0(f0(abaVar));
        Integer num2 = this.B.get(Integer.valueOf(i2));
        if (num2 != null) {
            num2.intValue();
            View H = androidx.compose.ui.platform.i.H(this.d.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (H != null) {
                d4Var.Y0(H);
            } else {
                d4Var.Z0(this.d, num2.intValue());
            }
            AccessibilityNodeInfo c12 = d4Var.c1();
            z65.g(c12, "info.unwrap()");
            z(i2, c12, this.D, null);
            Unit unit16 = Unit.a;
        }
        Integer num3 = this.C.get(Integer.valueOf(i2));
        if (num3 != null) {
            num3.intValue();
            View H2 = androidx.compose.ui.platform.i.H(this.d.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (H2 != null) {
                d4Var.W0(H2);
            } else {
                d4Var.X0(this.d, num3.intValue());
            }
            AccessibilityNodeInfo c13 = d4Var.c1();
            z65.g(c13, "info.unwrap()");
            z(i2, c13, this.E, null);
            Unit unit17 = Unit.a;
        }
    }

    public final void y0(aba abaVar, C0023h c0023h) {
        z65.h(abaVar, "newNode");
        z65.h(c0023h, "oldNode");
        List<aba> r2 = abaVar.r();
        int size = r2.size();
        for (int i2 = 0; i2 < size; i2++) {
            aba abaVar2 = r2.get(i2);
            if (Q().containsKey(Integer.valueOf(abaVar2.m())) && !c0023h.a().contains(Integer.valueOf(abaVar2.m()))) {
                j0(abaVar2);
            }
        }
        for (Map.Entry<Integer, C0023h> entry : this.G.entrySet()) {
            if (!Q().containsKey(entry.getKey())) {
                C(entry.getKey().intValue());
            }
        }
        List<aba> r3 = abaVar.r();
        int size2 = r3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            aba abaVar3 = r3.get(i3);
            if (Q().containsKey(Integer.valueOf(abaVar3.m())) && this.G.containsKey(Integer.valueOf(abaVar3.m()))) {
                C0023h c0023h2 = this.G.get(Integer.valueOf(abaVar3.m()));
                z65.e(c0023h2);
                y0(abaVar3, c0023h2);
            }
        }
    }
}
