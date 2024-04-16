package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: TextAndroidCanvas.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0017J\b\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J$\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001c\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J:\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J2\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000fH\u0016J8\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J0\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0018\u00100\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0012\u00103\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0012\u00104\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000201H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0016J0\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u00109\u001a\u000208H\u0017J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0017J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J\n\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010C\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0018\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J0\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020DH\u0017J(\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0010\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020GH\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0018H\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0005H\u0016J0\u0010O\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JH\u0010O\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010S\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000fH\u0016J*\u0010T\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010T\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010U\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010T\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010U\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JR\u0010T\u001a\u00020\u00032\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017JR\u0010T\u001a\u00020\u00032\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010T\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u0002012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JL\u0010e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020\u000f2\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010d\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J(\u0010i\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u001d2\u0006\u0010g\u001a\u00020\u001d2\u0006\u0010h\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u000fH\u0016J\u0010\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020lH\u0017J\u0018\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020mH\u0016J\u0018\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020oH\u0017J\u0018\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020l2\u0006\u0010n\u001a\u00020oH\u0017J0\u0010t\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u001d2\u0006\u0010q\u001a\u00020\u001d2\u0006\u0010r\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010w\u001a\u00020\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010w\u001a\u00020\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010x\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J0\u0010x\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010y\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\"\u0010|\u001a\u00020\u00032\u0006\u0010{\u001a\u00020z2\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010|\u001a\u00020\u00032\u0006\u0010{\u001a\u00020z2\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010}\u001a\u00020\u00032\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010~\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J*\u0010\u007f\u001a\u00020\u00032\b\u0010u\u001a\u0004\u0018\u00010a2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u007f\u001a\u00020\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010\u0084\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J$\u0010\u0084\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0083\u0001\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u0019\u0010\u0086\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0086\u0001\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J1\u0010\u0086\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J!\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000fH\u0016J+\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u001d2\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JC\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0007\u0010\u0088\u0001\u001a\u00020\u001d2\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JG\u0010\u0091\u0001\u001a\u00020\u00032\u0007\u0010\u008b\u0001\u001a\u00020\u00182\u0007\u0010\u008c\u0001\u001a\u00020\u001d2\u0007\u0010\u008d\u0001\u001a\u00020\u001d2\u0007\u0010\u008e\u0001\u001a\u00020\u00182\u0007\u0010\u008f\u0001\u001a\u00020\u001d2\u0007\u0010\u0090\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J5\u0010\u0091\u0001\u001a\u00020\u00032\u0007\u0010\u008b\u0001\u001a\u00020\u00182\u0007\u0010\u0092\u0001\u001a\u00020a2\u0007\u0010\u008e\u0001\u001a\u00020\u00182\u0007\u0010\u0093\u0001\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JH\u0010\u009b\u0001\u001a\u00020\u00032\u0007\u0010\u0094\u0001\u001a\u00020V2\u0007\u0010\u0095\u0001\u001a\u00020\u000f2\u0007\u0010\u0096\u0001\u001a\u00020a2\u0007\u0010\u0097\u0001\u001a\u00020\u000f2\u0007\u0010\u0098\u0001\u001a\u00020\u000f2\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J<\u0010\u009c\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u009c\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0085\u00012\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009c\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009c\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JF\u0010¢\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0007\u0010 \u0001\u001a\u00020\u001d2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010¢\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0085\u00012\u0006\u0010=\u001a\u00020<2\u0007\u0010 \u0001\u001a\u00020\u001d2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JW\u0010¦\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\u000f2\u0007\u0010¤\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0007\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010¦\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0007\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010¦\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030©\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0007\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017Jw\u0010²\u0001\u001a\u00020\u00032\u0007\u0010n\u001a\u00030ª\u00012\u0007\u0010«\u0001\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020\u000f2\t\u0010¬\u0001\u001a\u0004\u0018\u00010a2\u0007\u0010\u00ad\u0001\u001a\u00020\u000f2\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010d\u001a\u00020\u000f2\n\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00012\u0007\u0010°\u0001\u001a\u00020\u000f2\u0007\u0010±\u0001\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0013\u0010µ\u0001\u001a\u00020\u00032\b\u0010´\u0001\u001a\u00030³\u0001H\u0017R\u0018\u0010·\u0001\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0004\u0010¶\u0001¨\u0006º\u0001"}, d2 = {"Ldab;", "Landroid/graphics/Canvas;", "canvas", "", "a", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "enableZ", "disableZ", "isOpaque", "", "getWidth", "getHeight", "getDensity", "density", "setDensity", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "alpha", "saveLayerAlpha", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "filter", "setDrawFilter", "Landroid/graphics/Canvas$EdgeType;", MessageAttributes.TYPE, "quickReject", "Landroid/graphics/Picture;", "picture", "drawPicture", "dst", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "r", "g", "b", "drawARGB", "drawBitmap", "src", "", "colors", "offset", "stride", "x", "y", "width", "height", "hasAlpha", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "cx", "cy", "radius", "drawCircle", RemoteMessageConst.Notification.COLOR, "drawColor", "", "Landroid/graphics/PorterDuff$Mode;", "mode", "Landroid/graphics/BlendMode;", "startX", "startY", "stopX", "stopY", "drawLine", "pts", "count", "drawLines", "drawOval", "drawPaint", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "drawPath", "drawPoint", "drawPoints", "", "text", "index", "pos", "drawPosText", "", "drawRect", "drawRGB", "rx", "ry", "drawRoundRect", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "outerRadii", "innerRadii", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "drawText", "start", "end", "", "hOffset", "vOffset", "drawTextOnPath", "contextIndex", "contextCount", "isRtl", "drawTextRun", "contextStart", "contextEnd", "Landroid/graphics/text/MeasuredText;", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "Landroid/graphics/Canvas;", "nativeCanvas", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ClassVerificationFailure"})
/* renamed from: dab  reason: default package */
/* loaded from: classes.dex */
public final class dab extends Canvas {
    private Canvas a;

    public final void a(Canvas canvas) {
        z65.h(canvas, "canvas");
        this.a = canvas;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        boolean clipOutPath;
        z65.h(path, "path");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        clipOutPath = canvas.clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rectF) {
        boolean clipOutRect;
        z65.h(rectF, "rect");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(rectF);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path, Region.Op op) {
        z65.h(path, "path");
        z65.h(op, "op");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF, Region.Op op) {
        z65.h(rectF, "rect");
        z65.h(op, "op");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        z65.h(rectF, "oval");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        z65.h(bitmap, "bitmap");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        z65.h(bitmap, "bitmap");
        z65.h(fArr, "verts");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f, float f2, float f3, Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        z65.h(rectF, "outer");
        z65.h(rectF2, "inner");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        z65.h(iArr, "glyphIds");
        z65.h(fArr, "positions");
        z65.h(font, "font");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i, int i2, Paint paint) {
        z65.h(fArr, "pts");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        z65.h(rectF, "oval");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        z65.h(ninePatch, "patch");
        z65.h(rect, "dst");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        z65.h(path, "path");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        z65.h(picture, "picture");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f, float f2, Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        z65.h(cArr, "text");
        z65.h(fArr, "pos");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        z65.h(rectF, "rect");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        z65.h(renderNode, "renderNode");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        z65.h(rectF, "rect");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        z65.h(cArr, "text");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        z65.h(cArr, "text");
        z65.h(path, "path");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        z65.h(cArr, "text");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        z65.h(vertexMode, "mode");
        z65.h(fArr, "verts");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect rect) {
        z65.h(rect, "bounds");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(Matrix matrix) {
        z65.h(matrix, "ctm");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        z65.h(rectF, "rect");
        z65.h(edgeType, MessageAttributes.TYPE);
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public void scale(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public void translate(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f, f2);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        z65.h(rect, "rect");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        z65.h(path, "path");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect, Region.Op op) {
        z65.h(rect, "rect");
        z65.h(op, "op");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        z65.h(bitmap, "bitmap");
        z65.h(rectF, "dst");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        z65.h(rectF, "outer");
        z65.h(fArr, "outerRadii");
        z65.h(rectF2, "inner");
        z65.h(fArr2, "innerRadii");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        z65.h(fArr, "pts");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        z65.h(ninePatch, "patch");
        z65.h(rectF, "dst");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        z65.h(picture, "picture");
        z65.h(rectF, "dst");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        z65.h(fArr, "pts");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String str, float[] fArr, Paint paint) {
        z65.h(str, "text");
        z65.h(fArr, "pos");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        z65.h(rect, "r");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f, float f2, Paint paint) {
        z65.h(str, "text");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        z65.h(str, "text");
        z65.h(path, "path");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        z65.h(charSequence, "text");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF) {
        boolean quickReject;
        z65.h(rectF, "rect");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(rectF);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f, float f2, float f3, float f4) {
        boolean clipOutRect;
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(f, f2, f3, f4);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF) {
        z65.h(rectF, "rect");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        z65.h(bitmap, "bitmap");
        z65.h(rect2, "dst");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i, PorterDuff.Mode mode) {
        z65.h(mode, "mode");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        z65.h(picture, "picture");
        z65.h(rect, "dst");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        z65.h(str, "text");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        z65.h(measuredText, "text");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        z65.h(path, "path");
        z65.h(edgeType, MessageAttributes.TYPE);
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i, int i2, int i3, int i4) {
        boolean clipOutRect;
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(i, i2, i3, i4);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        z65.h(rect, "rect");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        z65.h(iArr, "colors");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i, BlendMode blendMode) {
        z65.h(blendMode, "mode");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        z65.h(charSequence, "text");
        z65.h(paint, "paint");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        boolean quickReject;
        z65.h(path, "path");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        z65.h(op, "op");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        z65.h(iArr, "colors");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j, BlendMode blendMode) {
        z65.h(blendMode, "mode");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j, blendMode);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        z65.h(edgeType, MessageAttributes.TYPE);
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        z65.h(bitmap, "bitmap");
        z65.h(matrix, "matrix");
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f, float f2, float f3, float f4) {
        boolean quickReject;
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(f, f2, f3, f4);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.a;
        if (canvas == null) {
            z65.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i, i2, i3, i4);
    }
}
