package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.ui.fragments.ChatFragment;
import kotlin.Metadata;
/* compiled from: PaletteTokens.kt */
@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0003\bÛ\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R \u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R \u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u00102\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R \u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R \u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R \u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R \u0010I\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R \u0010K\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010M\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010P\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006R \u0010S\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006R \u0010V\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R \u0010Y\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010\u0004\u001a\u0004\bX\u0010\u0006R \u0010[\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R \u0010^\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R \u0010`\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0004\u001a\u0004\ba\u0010\u0006R \u0010e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R \u0010g\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bf\u0010\u0004\u001a\u0004\b!\u0010\u0006R \u0010i\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010l\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bj\u0010\u0004\u001a\u0004\bk\u0010\u0006R \u0010o\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006R \u0010r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R \u0010t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\u0004\u001a\u0004\b&\u0010\u0006R \u0010v\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bu\u0010\u0004\u001a\u0004\b)\u0010\u0006R \u0010y\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bw\u0010\u0004\u001a\u0004\bx\u0010\u0006R \u0010|\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bz\u0010\u0004\u001a\u0004\b{\u0010\u0006R \u0010~\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b,\u0010\u0006R\"\u0010\u0081\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\b\u007f\u0010\u0004\u001a\u0005\b\u0080\u0001\u0010\u0006R#\u0010\u0084\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0083\u0001\u0010\u0006R#\u0010\u0087\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0004\u001a\u0005\b\u0086\u0001\u0010\u0006R\"\u0010\u0089\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\b\u0088\u0001\u0010\u0004\u001a\u0004\b.\u0010\u0006R\"\u0010\u008b\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\b\u008a\u0001\u0010\u0004\u001a\u0004\b0\u0010\u0006R#\u0010\u008e\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0004\u001a\u0005\b\u008d\u0001\u0010\u0006R#\u0010\u0091\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0004\u001a\u0005\b\u0090\u0001\u0010\u0006R#\u0010\u0094\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0004\u001a\u0005\b\u0093\u0001\u0010\u0006R\"\u0010\u0096\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\b\u0095\u0001\u0010\u0004\u001a\u0004\b3\u0010\u0006R\"\u0010\u0098\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\b\u0097\u0001\u0010\u0004\u001a\u0004\b5\u0010\u0006R#\u0010\u009b\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0004\u001a\u0005\b\u009a\u0001\u0010\u0006R#\u0010\u009e\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0004\u001a\u0005\b\u009d\u0001\u0010\u0006R\"\u0010 \u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\b\u009f\u0001\u0010\u0004\u001a\u0004\b8\u0010\u0006R#\u0010£\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0004\u001a\u0005\b¢\u0001\u0010\u0006R#\u0010¦\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0004\u001a\u0005\b¥\u0001\u0010\u0006R#\u0010©\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0004\u001a\u0005\b¨\u0001\u0010\u0006R#\u0010¬\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0004\u001a\u0005\b«\u0001\u0010\u0006R\"\u0010®\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\b\u00ad\u0001\u0010\u0004\u001a\u0004\b;\u0010\u0006R#\u0010±\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0004\u001a\u0005\b°\u0001\u0010\u0006R#\u0010´\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b²\u0001\u0010\u0004\u001a\u0005\b³\u0001\u0010\u0006R#\u0010·\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0004\u001a\u0005\b¶\u0001\u0010\u0006R\"\u0010¹\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\b¸\u0001\u0010\u0004\u001a\u0004\b>\u0010\u0006R\"\u0010»\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\bº\u0001\u0010\u0004\u001a\u0004\bA\u0010\u0006R#\u0010¾\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0004\u001a\u0005\b½\u0001\u0010\u0006R#\u0010Á\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0004\u001a\u0005\bÀ\u0001\u0010\u0006R\"\u0010Ã\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\bÂ\u0001\u0010\u0004\u001a\u0004\bD\u0010\u0006R#\u0010Æ\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÄ\u0001\u0010\u0004\u001a\u0005\bÅ\u0001\u0010\u0006R#\u0010É\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0004\u001a\u0005\bÈ\u0001\u0010\u0006R#\u0010Ì\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÊ\u0001\u0010\u0004\u001a\u0005\bË\u0001\u0010\u0006R#\u0010Ï\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0004\u001a\u0005\bÎ\u0001\u0010\u0006R\"\u0010Ñ\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0005\bÐ\u0001\u0010\u0004\u001a\u0004\bG\u0010\u0006R#\u0010Ô\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÒ\u0001\u0010\u0004\u001a\u0005\bÓ\u0001\u0010\u0006R#\u0010×\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÕ\u0001\u0010\u0004\u001a\u0005\bÖ\u0001\u0010\u0006R#\u0010Ú\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bØ\u0001\u0010\u0004\u001a\u0005\bÙ\u0001\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ý\u0001"}, d2 = {"Lyp7;", "", "Luc1;", "b", "J", "getBlack-0d7_KjU", "()J", "Black", c.a, "getError0-0d7_KjU", "Error0", DateTokenConverter.CONVERTER_KEY, "a", "Error10", e.a, "Error100", "f", "getError20-0d7_KjU", "Error20", "g", "getError30-0d7_KjU", "Error30", Image.TYPE_HIGH, "Error40", "i", "getError50-0d7_KjU", "Error50", "j", "getError60-0d7_KjU", "Error60", "k", "getError70-0d7_KjU", "Error70", "l", "getError80-0d7_KjU", "Error80", Image.TYPE_MEDIUM, "Error90", "n", "getError95-0d7_KjU", "Error95", "o", "getError99-0d7_KjU", "Error99", "p", "Neutral0", "q", "Neutral10", "r", "getNeutral100-0d7_KjU", "Neutral100", Image.TYPE_SMALL, "Neutral20", "t", "getNeutral30-0d7_KjU", "Neutral30", "u", "getNeutral40-0d7_KjU", "Neutral40", "v", "getNeutral50-0d7_KjU", "Neutral50", "w", "getNeutral60-0d7_KjU", "Neutral60", "x", "getNeutral70-0d7_KjU", "Neutral70", "y", "getNeutral80-0d7_KjU", "Neutral80", "z", "getNeutral90-0d7_KjU", "Neutral90", "A", "Neutral95", "B", "Neutral99", "C", "getNeutralVariant0-0d7_KjU", "NeutralVariant0", "D", "getNeutralVariant10-0d7_KjU", "NeutralVariant10", "E", "getNeutralVariant100-0d7_KjU", "NeutralVariant100", "F", "getNeutralVariant20-0d7_KjU", "NeutralVariant20", "G", "NeutralVariant30", "H", "getNeutralVariant40-0d7_KjU", "NeutralVariant40", "I", "NeutralVariant50", "getNeutralVariant60-0d7_KjU", "NeutralVariant60", "K", "getNeutralVariant70-0d7_KjU", "NeutralVariant70", "L", "NeutralVariant80", "M", "NeutralVariant90", "N", "getNeutralVariant95-0d7_KjU", "NeutralVariant95", "O", "getNeutralVariant99-0d7_KjU", "NeutralVariant99", "P", "getPrimary0-0d7_KjU", "Primary0", "Q", "Primary10", "R", "Primary100", "S", "getPrimary20-0d7_KjU", "Primary20", "T", "getPrimary30-0d7_KjU", "Primary30", "U", "Primary40", "V", "getPrimary50-0d7_KjU", "Primary50", "W", "getPrimary60-0d7_KjU", "Primary60", "X", "getPrimary70-0d7_KjU", "Primary70", "Y", "Primary80", "Z", "Primary90", "a0", "getPrimary95-0d7_KjU", "Primary95", "b0", "getPrimary99-0d7_KjU", "Primary99", "c0", "getSecondary0-0d7_KjU", "Secondary0", "d0", "Secondary10", "e0", "Secondary100", "f0", "getSecondary20-0d7_KjU", "Secondary20", "g0", "getSecondary30-0d7_KjU", "Secondary30", "h0", "Secondary40", "i0", "getSecondary50-0d7_KjU", "Secondary50", "j0", "getSecondary60-0d7_KjU", "Secondary60", "k0", "getSecondary70-0d7_KjU", "Secondary70", "l0", "getSecondary80-0d7_KjU", "Secondary80", "m0", "Secondary90", "n0", "getSecondary95-0d7_KjU", "Secondary95", "o0", "getSecondary99-0d7_KjU", "Secondary99", "p0", "getTertiary0-0d7_KjU", "Tertiary0", "q0", "Tertiary10", "r0", "Tertiary100", "s0", "getTertiary20-0d7_KjU", "Tertiary20", "t0", "getTertiary30-0d7_KjU", "Tertiary30", "u0", "Tertiary40", "v0", "getTertiary50-0d7_KjU", "Tertiary50", "w0", "getTertiary60-0d7_KjU", "Tertiary60", "x0", "getTertiary70-0d7_KjU", "Tertiary70", "y0", "getTertiary80-0d7_KjU", "Tertiary80", "z0", "Tertiary90", "A0", "getTertiary95-0d7_KjU", "Tertiary95", "B0", "getTertiary99-0d7_KjU", "Tertiary99", "C0", "getWhite-0d7_KjU", "White", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yp7  reason: default package */
/* loaded from: classes.dex */
public final class yp7 {
    public static final yp7 a = new yp7();
    private static final long b = yc1.e(0, 0, 0, 0, 8, null);
    private static final long c = yc1.e(0, 0, 0, 0, 8, null);
    private static final long d = yc1.e(65, 14, 11, 0, 8, null);
    private static final long e = yc1.e(255, 255, 255, 0, 8, null);
    private static final long f = yc1.e(96, 20, 16, 0, 8, null);
    private static final long g = yc1.e(140, 29, 24, 0, 8, null);
    private static final long h = yc1.e(179, 38, 30, 0, 8, null);
    private static final long i = yc1.e(220, 54, 46, 0, 8, null);
    private static final long j = yc1.e(228, 105, 98, 0, 8, null);
    private static final long k = yc1.e(236, 146, 142, 0, 8, null);
    private static final long l = yc1.e(242, SyslogConstants.LOG_LOCAL7, 181, 0, 8, null);
    private static final long m = yc1.e(249, 222, 220, 0, 8, null);
    private static final long n = yc1.e(252, 238, 238, 0, 8, null);
    private static final long o = yc1.e(255, 251, 249, 0, 8, null);
    private static final long p = yc1.e(0, 0, 0, 0, 8, null);
    private static final long q = yc1.e(28, 27, 31, 0, 8, null);
    private static final long r = yc1.e(255, 255, 255, 0, 8, null);
    private static final long s = yc1.e(49, 48, 51, 0, 8, null);
    private static final long t = yc1.e(72, 70, 73, 0, 8, null);
    private static final long u = yc1.e(96, 93, 98, 0, 8, null);
    private static final long v = yc1.e(120, 117, 121, 0, 8, null);
    private static final long w = yc1.e(147, SyslogConstants.LOG_LOCAL2, 148, 0, 8, null);
    private static final long x = yc1.e(174, 170, 174, 0, 8, null);
    private static final long y = yc1.e(ChatFragment.REQUEST_PERMISSION_CAMERA, 197, ChatFragment.REQUEST_PERMISSION_READ_EXTERNAL, 0, 8, null);
    private static final long z = yc1.e(230, 225, 229, 0, 8, null);
    private static final long A = yc1.e(244, 239, 244, 0, 8, null);
    private static final long B = yc1.e(255, 251, 254, 0, 8, null);
    private static final long C = yc1.e(0, 0, 0, 0, 8, null);
    private static final long D = yc1.e(29, 26, 34, 0, 8, null);
    private static final long E = yc1.e(255, 255, 255, 0, 8, null);
    private static final long F = yc1.e(50, 47, 55, 0, 8, null);
    private static final long G = yc1.e(73, 69, 79, 0, 8, null);
    private static final long H = yc1.e(96, 93, 102, 0, 8, null);
    private static final long I = yc1.e(121, 116, 126, 0, 8, null);
    private static final long J = yc1.e(147, 143, 153, 0, 8, null);
    private static final long K = yc1.e(174, 169, 180, 0, 8, null);
    private static final long L = yc1.e(ChatFragment.REQUEST_PERMISSION_READ_EXTERNAL, 196, 208, 0, 8, null);
    private static final long M = yc1.e(231, 224, 236, 0, 8, null);
    private static final long N = yc1.e(245, 238, 250, 0, 8, null);
    private static final long O = yc1.e(255, 251, 254, 0, 8, null);
    private static final long P = yc1.e(0, 0, 0, 0, 8, null);
    private static final long Q = yc1.e(33, 0, 93, 0, 8, null);
    private static final long R = yc1.e(255, 255, 255, 0, 8, null);
    private static final long S = yc1.e(56, 30, 114, 0, 8, null);
    private static final long T = yc1.e(79, 55, 139, 0, 8, null);
    private static final long U = yc1.e(103, 80, 164, 0, 8, null);
    private static final long V = yc1.e(127, 103, 190, 0, 8, null);
    private static final long W = yc1.e(154, 130, 219, 0, 8, null);
    private static final long X = yc1.e(182, 157, 248, 0, 8, null);
    private static final long Y = yc1.e(208, 188, 255, 0, 8, null);
    private static final long Z = yc1.e(234, 221, 255, 0, 8, null);
    private static final long a0 = yc1.e(246, 237, 255, 0, 8, null);
    private static final long b0 = yc1.e(255, 251, 254, 0, 8, null);
    private static final long c0 = yc1.e(0, 0, 0, 0, 8, null);
    private static final long d0 = yc1.e(29, 25, 43, 0, 8, null);
    private static final long e0 = yc1.e(255, 255, 255, 0, 8, null);
    private static final long f0 = yc1.e(51, 45, 65, 0, 8, null);
    private static final long g0 = yc1.e(74, 68, 88, 0, 8, null);
    private static final long h0 = yc1.e(98, 91, 113, 0, 8, null);
    private static final long i0 = yc1.e(122, 114, 137, 0, 8, null);
    private static final long j0 = yc1.e(149, 141, 165, 0, 8, null);
    private static final long k0 = yc1.e(SyslogConstants.LOG_LOCAL6, 167, 192, 0, 8, null);
    private static final long l0 = yc1.e(ChatFragment.REQUEST_PERMISSION_RECORD_AUDIO, 194, 220, 0, 8, null);
    private static final long m0 = yc1.e(232, 222, 248, 0, 8, null);
    private static final long n0 = yc1.e(246, 237, 255, 0, 8, null);
    private static final long o0 = yc1.e(255, 251, 254, 0, 8, null);
    private static final long p0 = yc1.e(0, 0, 0, 0, 8, null);
    private static final long q0 = yc1.e(49, 17, 29, 0, 8, null);
    private static final long r0 = yc1.e(255, 255, 255, 0, 8, null);
    private static final long s0 = yc1.e(73, 37, 50, 0, 8, null);
    private static final long t0 = yc1.e(99, 59, 72, 0, 8, null);
    private static final long u0 = yc1.e(125, 82, 96, 0, 8, null);
    private static final long v0 = yc1.e(SyslogConstants.LOG_LOCAL3, 105, 119, 0, 8, null);
    private static final long w0 = yc1.e(181, 131, 146, 0, 8, null);
    private static final long x0 = yc1.e(210, 157, 172, 0, 8, null);
    private static final long y0 = yc1.e(239, SyslogConstants.LOG_LOCAL7, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, 0, 8, null);
    private static final long z0 = yc1.e(255, 216, 228, 0, 8, null);
    private static final long A0 = yc1.e(255, 236, 241, 0, 8, null);
    private static final long B0 = yc1.e(255, 251, 250, 0, 8, null);
    private static final long C0 = yc1.e(255, 255, 255, 0, 8, null);

    private yp7() {
    }

    public final long a() {
        return d;
    }

    public final long b() {
        return e;
    }

    public final long c() {
        return h;
    }

    public final long d() {
        return m;
    }

    public final long e() {
        return p;
    }

    public final long f() {
        return q;
    }

    public final long g() {
        return s;
    }

    public final long h() {
        return A;
    }

    public final long i() {
        return B;
    }

    public final long j() {
        return G;
    }

    public final long k() {
        return I;
    }

    public final long l() {
        return L;
    }

    public final long m() {
        return M;
    }

    public final long n() {
        return Q;
    }

    public final long o() {
        return R;
    }

    public final long p() {
        return U;
    }

    public final long q() {
        return Y;
    }

    public final long r() {
        return Z;
    }

    public final long s() {
        return d0;
    }

    public final long t() {
        return e0;
    }

    public final long u() {
        return h0;
    }

    public final long v() {
        return m0;
    }

    public final long w() {
        return q0;
    }

    public final long x() {
        return r0;
    }

    public final long y() {
        return u0;
    }

    public final long z() {
        return z0;
    }
}
