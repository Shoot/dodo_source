package im.threads.ui.widget.textView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.business.markdown.MarkdownConfig;
import im.threads.business.markdown.MarkdownProcessor;
import im.threads.business.markdown.MarkwonMarkdownProcessor;
import im.threads.business.transport.MessageAttributes;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.widget.CustomFontTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BubbleMessageTextView.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J6\u0010 \u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u000f2\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020$0#0\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0014\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lim/threads/ui/widget/textView/BubbleMessageTextView;", "Lim/threads/ui/widget/CustomFontTextView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chatStyle", "Lim/threads/ui/ChatStyle;", "lastLineExtraPaddingSymbolsCount", "", "lastLinePadding", "", "mHasImageInText", "", "markdownProcessor", "Lim/threads/business/markdown/MarkdownProcessor;", "addPadding", "", "text", "bindTimestampView", "", "timeTextView", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "fetchLastLinePadding", "getSpanned", "Landroid/text/Spanned;", "isOperatorMessage", "invalidateDrawable", "dr", "Landroid/graphics/drawable/Drawable;", "setFormattedText", "links", "", "Lkotlin/Pair;", "Landroid/view/View$OnClickListener;", "setText", MessageAttributes.TYPE, "Landroid/widget/TextView$BufferType;", "setTypefaceView", "trimEndSpannable", "Landroid/text/SpannableStringBuilder;", "spannable", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BubbleMessageTextView extends CustomFontTextView {
    public static final Companion Companion = new Companion(null);
    private static final Spanned SPACE = Html.fromHtml("&#160;");
    private final ChatStyle chatStyle;
    private float lastLineExtraPaddingSymbolsCount;
    private String lastLinePadding;
    private boolean mHasImageInText;
    private final MarkdownProcessor markdownProcessor;

    /* compiled from: BubbleMessageTextView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lim/threads/ui/widget/textView/BubbleMessageTextView$Companion;", "", "()V", "SPACE", "Landroid/text/Spanned;", "kotlin.jvm.PlatformType", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BubbleMessageTextView(Context context) {
        super(context);
        this.lastLinePadding = "";
        Config.Companion companion = Config.Companion;
        ChatStyle chatStyle = companion.getInstance().getChatStyle();
        this.chatStyle = chatStyle;
        Context context2 = companion.getInstance().context;
        MarkdownConfig incomingMarkdownConfiguration = chatStyle.getIncomingMarkdownConfiguration();
        z65.g(incomingMarkdownConfiguration, "chatStyle.incomingMarkdownConfiguration");
        MarkdownConfig outgoingMarkdownConfiguration = chatStyle.getOutgoingMarkdownConfiguration();
        z65.g(outgoingMarkdownConfiguration, "chatStyle.outgoingMarkdownConfiguration");
        this.markdownProcessor = new MarkwonMarkdownProcessor(context2, incomingMarkdownConfiguration, outgoingMarkdownConfiguration, false);
    }

    private final CharSequence addPadding(CharSequence charSequence) {
        SpannableStringBuilder trimEndSpannable;
        if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(this.lastLinePadding) && (trimEndSpannable = trimEndSpannable(new SpannableStringBuilder(charSequence))) != null) {
            SpannableStringBuilder append = trimEndSpannable.append((CharSequence) this.lastLinePadding);
            z65.g(append, "it.append(lastLinePadding)");
            return append;
        }
        return charSequence;
    }

    private final void fetchLastLinePadding(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BubbleMessageTextView);
        z65.g(obtainStyledAttributes, "context.obtainStyledAttr…le.BubbleMessageTextView)");
        try {
            float f = obtainStyledAttributes.getFloat(R.styleable.BubbleMessageTextView_last_line_extra_padding_symbols, 0.0f);
            obtainStyledAttributes.recycle();
            this.lastLineExtraPaddingSymbolsCount = f;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final Spanned getSpanned(CharSequence charSequence, boolean z) {
        if (z) {
            return this.markdownProcessor.parseOperatorMessage(charSequence.toString());
        }
        return this.markdownProcessor.parseClientMessage(charSequence.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFormattedText$default(BubbleMessageTextView bubbleMessageTextView, CharSequence charSequence, boolean z, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = new ArrayList();
        }
        bubbleMessageTextView.setFormattedText(charSequence, z, list);
    }

    private final SpannableStringBuilder trimEndSpannable(SpannableStringBuilder spannableStringBuilder) {
        boolean y;
        if (spannableStringBuilder != null) {
            y = l0b.y(spannableStringBuilder);
            if (!y) {
                int length = spannableStringBuilder.length() - 1;
                int length2 = spannableStringBuilder.length() - 1;
                boolean z = false;
                while (spannableStringBuilder.charAt(length) == 160 && length > 0) {
                    length--;
                    z = true;
                }
                if (z) {
                    SpannableStringBuilder delete = spannableStringBuilder.delete(length, length2);
                    z65.g(delete, "{\n            spannable.…Start, trimEnd)\n        }");
                    return delete;
                }
                return spannableStringBuilder;
            }
            return null;
        }
        return null;
    }

    public final void bindTimestampView(BubbleTimeTextView bubbleTimeTextView) {
        String F;
        z65.h(bubbleTimeTextView, "timeTextView");
        bubbleTimeTextView.measure(0, 0);
        int measuredWidth = bubbleTimeTextView.getMeasuredWidth() * 2;
        StringBuilder sb = new StringBuilder(" ");
        Rect rect = new Rect();
        TextPaint paint = getPaint();
        z65.g(paint, "paint");
        for (int i = 0; i < measuredWidth; i = rect.width()) {
            sb.append("_");
            paint.getTextBounds(sb.toString(), 0, sb.toString().length(), rect);
        }
        for (int i2 = 0; i2 < this.lastLineExtraPaddingSymbolsCount; i2++) {
            sb.append("_");
        }
        String sb2 = sb.toString();
        z65.g(sb2, "paddingBuilder.toString()");
        F = l0b.F(sb2, "_", SPACE.toString(), false, 4, null);
        this.lastLinePadding = F;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        z65.h(drawable, "dr");
        if (this.mHasImageInText) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFormattedText(java.lang.CharSequence r9, boolean r10, java.util.List<? extends kotlin.Pair<java.lang.String, ? extends android.view.View.OnClickListener>> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "links"
            defpackage.z65.h(r11, r0)
            if (r9 == 0) goto Ld
            boolean r0 = defpackage.c0b.y(r9)
            if (r0 == 0) goto Lf
        Ld:
            java.lang.String r9 = ""
        Lf:
            java.lang.CharSequence r9 = r8.addPadding(r9)
            android.text.Spanned r9 = r8.getSpanned(r9, r10)
            boolean r10 = r8.mHasImageInText
            if (r10 == 0) goto L1e
            r10 = 0
            r8.mHasImageInText = r10
        L1e:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r9)
            java.util.Iterator r9 = r11.iterator()
            r11 = -1
        L28:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r9.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.c()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L28
            boolean r1 = defpackage.c0b.y(r1)
            if (r1 == 0) goto L43
            goto L28
        L43:
            im.threads.ui.widget.textView.BubbleMessageTextView$setFormattedText$clickableSpan$1 r1 = new im.threads.ui.widget.textView.BubbleMessageTextView$setFormattedText$clickableSpan$1
            r1.<init>()
            java.lang.String r2 = r10.toString()
            java.lang.String r3 = "spannableString.toString()"
            defpackage.z65.g(r2, r3)
            java.lang.Object r3 = r0.c()
            defpackage.z65.e(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 + 1
            r5 = 0
            r6 = 4
            r7 = 0
            int r11 = defpackage.c0b.Z(r2, r3, r4, r5, r6, r7)
            if (r11 < 0) goto L28
            java.lang.Object r0 = r0.c()
            defpackage.z65.e(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            int r0 = r0 + r11
            r2 = 33
            r10.setSpan(r1, r11, r0, r2)
            goto L28
        L79:
            im.threads.ui.utils.NoLongClickMovementMethod$Companion r9 = im.threads.ui.utils.NoLongClickMovementMethod.Companion
            android.text.method.LinkMovementMethod r9 = r9.getInstance()
            r8.setMovementMethod(r9)
            android.widget.TextView$BufferType r9 = android.widget.TextView.BufferType.SPANNABLE
            r8.setText(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.widget.textView.BubbleMessageTextView.setFormattedText(java.lang.CharSequence, boolean, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 != false) goto L11;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setText(java.lang.CharSequence r2, android.widget.TextView.BufferType r3) {
        /*
            r1 = this;
            java.lang.String r0 = "type"
            defpackage.z65.h(r3, r0)
            if (r2 == 0) goto Ld
            boolean r0 = defpackage.c0b.y(r2)
            if (r0 == 0) goto Lf
        Ld:
            java.lang.String r2 = ""
        Lf:
            java.lang.CharSequence r2 = r1.addPadding(r2)
            boolean r0 = r1.mHasImageInText
            if (r0 == 0) goto L1a
            r0 = 0
            r1.mHasImageInText = r0
        L1a:
            super.setText(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.widget.textView.BubbleMessageTextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    @Override // im.threads.ui.widget.CustomFontTextView
    public void setTypefaceView(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.bubbleMessageFont)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.bubbleMessageFont));
        } else {
            super.setTypefaceView(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleMessageTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attrs");
        this.lastLinePadding = "";
        Config.Companion companion = Config.Companion;
        ChatStyle chatStyle = companion.getInstance().getChatStyle();
        this.chatStyle = chatStyle;
        Context context2 = companion.getInstance().context;
        MarkdownConfig incomingMarkdownConfiguration = chatStyle.getIncomingMarkdownConfiguration();
        z65.g(incomingMarkdownConfiguration, "chatStyle.incomingMarkdownConfiguration");
        MarkdownConfig outgoingMarkdownConfiguration = chatStyle.getOutgoingMarkdownConfiguration();
        z65.g(outgoingMarkdownConfiguration, "chatStyle.outgoingMarkdownConfiguration");
        this.markdownProcessor = new MarkwonMarkdownProcessor(context2, incomingMarkdownConfiguration, outgoingMarkdownConfiguration, false);
        fetchLastLinePadding(context, attributeSet);
    }
}
