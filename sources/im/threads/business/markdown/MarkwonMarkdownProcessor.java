package im.threads.business.markdown;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.q86;
import defpackage.s86;
import defpackage.y86;
import im.threads.business.markdown.LinkifyPlugin;
import im.threads.business.markdown.MarkwonMarkdownProcessor;
import im.threads.business.models.ExtractedLink;
import im.threads.business.utils.UrlUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MarkwonMarkdownProcessor.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001f"}, d2 = {"Lim/threads/business/markdown/MarkwonMarkdownProcessor;", "Lim/threads/business/markdown/MarkdownProcessor;", "Lim/threads/business/markdown/MarkdownConfig;", "markdownConfig", "Lq86;", "configureParser", "Ly86$a;", "builder", "config", "", "configureMessagesView", "Ls86$b;", "configureLinks", "", "text", "Landroid/text/Spanned;", "parseClientMessage", "parseOperatorMessage", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "", "highlightEmails", "Z", "incomingProcessor", "Lq86;", "outgoingProcessor", "incomingMarkdownConfig", "outgoingMarkdownConfig", "<init>", "(Landroid/content/Context;Lim/threads/business/markdown/MarkdownConfig;Lim/threads/business/markdown/MarkdownConfig;Z)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MarkwonMarkdownProcessor implements MarkdownProcessor {
    private final Context context;
    private final boolean highlightEmails;
    private final q86 incomingProcessor;
    private final q86 outgoingProcessor;

    public MarkwonMarkdownProcessor(Context context, MarkdownConfig markdownConfig, MarkdownConfig markdownConfig2, boolean z) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(markdownConfig, "incomingMarkdownConfig");
        z65.h(markdownConfig2, "outgoingMarkdownConfig");
        this.context = context;
        this.highlightEmails = z;
        this.incomingProcessor = configureParser(markdownConfig);
        this.outgoingProcessor = configureParser(markdownConfig2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureLinks(s86.b bVar) {
        bVar.j(new mq5() { // from class: u86
            @Override // defpackage.mq5
            public final void a(View view, String str) {
                MarkwonMarkdownProcessor.configureLinks$lambda$22(view, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureLinks$lambda$22(View view, String str) {
        String extractDeepLink;
        z65.h(view, "view");
        z65.h(str, ElementGenerator.TYPE_LINK);
        ExtractedLink extractLink = UrlUtils.extractLink(str);
        if (extractLink == null || (extractDeepLink = extractLink.getLink()) == null) {
            extractDeepLink = UrlUtils.extractDeepLink(str);
        }
        if (extractDeepLink != null) {
            Context context = view.getContext();
            z65.g(context, "view.context");
            UrlUtils.openUrl(context, extractDeepLink);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureMessagesView(y86.a aVar, MarkdownConfig markdownConfig) {
        Integer linkColor = markdownConfig.getLinkColor();
        if (linkColor != null) {
            aVar.R(linkColor.intValue());
        }
        aVar.Q(markdownConfig.isLinkUnderlined());
        Integer blockMargin = markdownConfig.getBlockMargin();
        if (blockMargin != null) {
            aVar.x(blockMargin.intValue());
        }
        Integer blockQuoteWidth = markdownConfig.getBlockQuoteWidth();
        if (blockQuoteWidth != null) {
            aVar.z(blockQuoteWidth.intValue());
        }
        Integer blockQuoteColor = markdownConfig.getBlockQuoteColor();
        if (blockQuoteColor != null) {
            aVar.y(blockQuoteColor.intValue());
        }
        Integer listItemColor = markdownConfig.getListItemColor();
        if (listItemColor != null) {
            aVar.S(listItemColor.intValue());
        }
        Integer bulletListItemStrokeWidth = markdownConfig.getBulletListItemStrokeWidth();
        if (bulletListItemStrokeWidth != null) {
            aVar.B(bulletListItemStrokeWidth.intValue());
        }
        Integer bulletWidth = markdownConfig.getBulletWidth();
        if (bulletWidth != null) {
            aVar.C(bulletWidth.intValue());
        }
        Integer codeTextColor = markdownConfig.getCodeTextColor();
        if (codeTextColor != null) {
            aVar.J(codeTextColor.intValue());
        }
        Integer codeBackgroundColor = markdownConfig.getCodeBackgroundColor();
        if (codeBackgroundColor != null) {
            aVar.D(codeBackgroundColor.intValue());
        }
        Integer codeBlockTextColor = markdownConfig.getCodeBlockTextColor();
        if (codeBlockTextColor != null) {
            aVar.G(codeBlockTextColor.intValue());
        }
        Integer codeBlockBackgroundColor = markdownConfig.getCodeBlockBackgroundColor();
        if (codeBlockBackgroundColor != null) {
            aVar.E(codeBlockBackgroundColor.intValue());
        }
        Typeface codeTypeface = markdownConfig.getCodeTypeface();
        if (codeTypeface != null) {
            aVar.L(codeTypeface);
        }
        Typeface codeBlockTypeface = markdownConfig.getCodeBlockTypeface();
        if (codeBlockTypeface != null) {
            aVar.I(codeBlockTypeface);
        }
        Integer codeTextSize = markdownConfig.getCodeTextSize();
        if (codeTextSize != null) {
            aVar.K(codeTextSize.intValue());
        }
        Integer codeBlockTextSize = markdownConfig.getCodeBlockTextSize();
        if (codeBlockTextSize != null) {
            aVar.H(codeBlockTextSize.intValue());
        }
        Integer headingBreakHeight = markdownConfig.getHeadingBreakHeight();
        if (headingBreakHeight != null) {
            aVar.N(headingBreakHeight.intValue());
        }
        Integer headingBreakColor = markdownConfig.getHeadingBreakColor();
        if (headingBreakColor != null) {
            aVar.M(headingBreakColor.intValue());
        }
        Typeface headingTypeface = markdownConfig.getHeadingTypeface();
        if (headingTypeface != null) {
            aVar.P(headingTypeface);
        }
        float[] headingTextSizeMultipliers = markdownConfig.getHeadingTextSizeMultipliers();
        if (headingTextSizeMultipliers != null) {
            aVar.O(headingTextSizeMultipliers);
        }
        Integer thematicBreakColor = markdownConfig.getThematicBreakColor();
        if (thematicBreakColor != null) {
            aVar.T(thematicBreakColor.intValue());
        }
        Integer thematicBreakHeight = markdownConfig.getThematicBreakHeight();
        if (thematicBreakHeight != null) {
            aVar.U(thematicBreakHeight.intValue());
        }
    }

    private final q86 configureParser(final MarkdownConfig markdownConfig) {
        q86.a b = q86.a(this.context).b(mza.a()).b(pw4.a()).b(new s1() { // from class: im.threads.business.markdown.MarkwonMarkdownProcessor$configureParser$builder$1
            @Override // defpackage.s1, defpackage.v86
            public void configureConfiguration(s86.b bVar) {
                z65.h(bVar, "builder");
                super.configureConfiguration(bVar);
                MarkwonMarkdownProcessor.this.configureLinks(bVar);
            }

            @Override // defpackage.s1, defpackage.v86
            public void configureTheme(y86.a aVar) {
                z65.h(aVar, "builder");
                MarkwonMarkdownProcessor.this.configureMessagesView(aVar, markdownConfig);
            }
        });
        z65.g(b, "private fun configurePar…urn builder.build()\n    }");
        if (this.highlightEmails) {
            b.b(LinkifyPlugin.Companion.create$default(LinkifyPlugin.Companion, false, 1, null));
        } else {
            b.b(LinkifyPlugin.Companion.create(5));
        }
        q86 a = b.a();
        z65.g(a, "builder.build()");
        return a;
    }

    @Override // im.threads.business.markdown.MarkdownProcessor
    public Spanned parseClientMessage(String str) {
        z65.h(str, "text");
        Spanned b = this.outgoingProcessor.b(str);
        z65.g(b, "outgoingProcessor.toMarkdown(text)");
        return b;
    }

    @Override // im.threads.business.markdown.MarkdownProcessor
    public Spanned parseOperatorMessage(String str) {
        z65.h(str, "text");
        Spanned b = this.incomingProcessor.b(str);
        z65.g(b, "incomingProcessor.toMarkdown(text)");
        return b;
    }

    public /* synthetic */ MarkwonMarkdownProcessor(Context context, MarkdownConfig markdownConfig, MarkdownConfig markdownConfig2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, markdownConfig, markdownConfig2, (i & 8) != 0 ? true : z);
    }
}
