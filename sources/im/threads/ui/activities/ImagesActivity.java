package im.threads.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.business.models.FileDescription;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.utils.Balloon;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.ThreadsPermissionChecker;
import im.threads.ui.ChatStyle;
import im.threads.ui.activities.ImagesActivity;
import im.threads.ui.config.Config;
import im.threads.ui.fragments.PermissionDescriptionAlertFragment;
import im.threads.ui.permissions.PermissionsActivity;
import im.threads.ui.styles.permissions.PermissionDescriptionType;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.ThreadRunnerKt;
import im.threads.ui.utils.ViewExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImagesActivity.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RB\u0007¢\u0006\u0004\bP\u0010QJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0017\u001a\u00020\bH\u0014J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\"\u0010\"\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 H\u0014J\u0018\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010&\u001a\u00020\bH\u0016J \u0010+\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0011H\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0010\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0011H\u0016R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R&\u0010:\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`98\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010N¨\u0006S"}, d2 = {"Lim/threads/ui/activities/ImagesActivity;", "Lim/threads/ui/activities/BaseActivity;", "Landroidx/viewpager/widget/ViewPager$j;", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment$OnAllowPermissionClickListener;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/view/View;", "toolbarShadow", "", "initToolbar", "initToolbarTextPosition", "Landroid/widget/ImageButton;", "backButton", "setClickForBackBtn", "downloadImage", "requestPermission", "showStoragePermissionDescriptionDialog", "", "requestCode", "startStoragePermissionActivity", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lim/threads/ui/styles/permissions/PermissionDescriptionType;", MessageAttributes.TYPE, "onAllowClick", "onDialogDetached", "position", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "onPageSelected", "state", "onPageScrollStateChanged", "Landroidx/viewpager/widget/ViewPager;", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "Lim/threads/ui/ChatStyle;", "style", "Lim/threads/ui/ChatStyle;", "collectionSize", "I", "Ljava/util/ArrayList;", "Lim/threads/business/models/FileDescription;", "Lkotlin/collections/ArrayList;", "files", "Ljava/util/ArrayList;", "Lwn1;", "compositeDisposable", "Lwn1;", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment;", "permissionDescrAlertFragment", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment;", "Lim/threads/ui/config/Config;", "config$delegate", "Lrn5;", "getConfig", "()Lim/threads/ui/config/Config;", "config", "Landroid/widget/TextView;", "titleTextView", "Landroid/widget/TextView;", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ImagesActivity extends BaseActivity implements ViewPager.j, PermissionDescriptionAlertFragment.OnAllowPermissionClickListener {
    private static final int CODE_REQUEST_DOWNLOAD = 1;
    public static final Companion Companion = new Companion(null);
    private int collectionSize;
    private final rn5 config$delegate;
    private final rn5 database$delegate;
    private ViewPager mViewPager;
    private PermissionDescriptionAlertFragment permissionDescrAlertFragment;
    private TextView titleTextView;
    private ChatStyle style = Config.Companion.getInstance().getChatStyle();
    private ArrayList<FileDescription> files = new ArrayList<>();
    private wn1 compositeDisposable = new wn1();

    /* compiled from: ImagesActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/ui/activities/ImagesActivity$Companion;", "", "()V", "CODE_REQUEST_DOWNLOAD", "", "getStartIntent", "Landroid/content/Intent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "fileDescription", "Lim/threads/business/models/FileDescription;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent getStartIntent(Context context, FileDescription fileDescription) {
            Intent putExtra = new Intent(context, ImagesActivity.class).putExtra("FileDescription", fileDescription);
            z65.g(putExtra, "Intent(context, ImagesAc…Description\n            )");
            return putExtra;
        }
    }

    public ImagesActivity() {
        rn5 b;
        rn5 b2;
        b = yn5.b(ImagesActivity$config$2.INSTANCE);
        this.config$delegate = b;
        b2 = yn5.b(ImagesActivity$special$$inlined$inject$1.INSTANCE);
        this.database$delegate = b2;
    }

    private final void downloadImage() {
        if (Build.VERSION.SDK_INT < 29 && !ThreadsPermissionChecker.isWriteExternalPermissionGranted(this)) {
            requestPermission();
            return;
        }
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var != null) {
            sk1 d = sk1.b(new t4() { // from class: iw4
                @Override // defpackage.t4
                public final void run() {
                    ImagesActivity.downloadImage$lambda$4(ImagesActivity.this);
                }
            }).g(dw9.b()).d(ti.c());
            t4 t4Var = new t4() { // from class: jw4
                @Override // defpackage.t4
                public final void run() {
                    ImagesActivity.downloadImage$lambda$5(ImagesActivity.this);
                }
            };
            final ImagesActivity$downloadImage$3 imagesActivity$downloadImage$3 = new ImagesActivity$downloadImage$3(this);
            wn1Var.b(d.e(t4Var, new wr1() { // from class: kw4
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ImagesActivity.downloadImage$lambda$6(Function1.this, obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadImage$lambda$4(ImagesActivity imagesActivity) {
        z65.h(imagesActivity, "this$0");
        ArrayList<FileDescription> arrayList = imagesActivity.files;
        ViewPager viewPager = imagesActivity.mViewPager;
        if (viewPager == null) {
            z65.z("mViewPager");
            viewPager = null;
        }
        FileDescription fileDescription = arrayList.get(viewPager.getCurrentItem());
        z65.g(fileDescription, "files[mViewPager.currentItem]");
        FileUtils.saveToDownloads(fileDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadImage$lambda$5(ImagesActivity imagesActivity) {
        z65.h(imagesActivity, "this$0");
        String string = imagesActivity.getString(R.string.ecc_saved_to_downloads);
        z65.g(string, "getString(R.string.ecc_saved_to_downloads)");
        Balloon.show(imagesActivity, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadImage$lambda$6(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final Config getConfig() {
        return (Config) this.config$delegate.getValue();
    }

    private final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    public static final Intent getStartIntent(Context context, FileDescription fileDescription) {
        return Companion.getStartIntent(context, fileDescription);
    }

    private final void initToolbar(Toolbar toolbar, View view) {
        setSupportActionBar(toolbar);
        int c = iu1.c(this, this.style.chatStatusBarColorResId);
        int c2 = iu1.c(this, this.style.chatToolbarColorResId);
        boolean z = getResources().getBoolean(this.style.windowLightStatusBarResId);
        ImageButton imageButton = (ImageButton) toolbar.findViewById(R.id.back_button);
        View findViewById = toolbar.findViewById(R.id.title);
        z65.g(findViewById, "toolbar.findViewById<TextView>(R.id.title)");
        this.titleTextView = (TextView) findViewById;
        super.setStatusBarColor(z, c);
        toolbar.setBackgroundColor(c2);
        ColorsHelper.setTint(this, imageButton, getConfig().getChatStyle().chatToolbarTextColorResId);
        if (getResources().getBoolean(this.style.isChatTitleShadowVisible)) {
            ViewExtensionsKt.visible(view);
        } else {
            ViewExtensionsKt.invisible(view);
            toolbar.setElevation(0.0f);
        }
        initToolbarTextPosition();
        z65.g(imageButton, "backBtn");
        setClickForBackBtn(imageButton);
    }

    private final void initToolbarTextPosition() {
        int i;
        if (Config.Companion.getInstance().getChatStyle().isToolbarTextCentered) {
            i = 17;
        } else {
            i = 16;
        }
        TextView textView = this.titleTextView;
        if (textView == null) {
            z65.z("titleTextView");
            textView = null;
        }
        textView.setGravity(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageSelected$lambda$7(ImagesActivity imagesActivity) {
        z65.h(imagesActivity, "this$0");
        ViewPager viewPager = imagesActivity.mViewPager;
        TextView textView = null;
        if (viewPager == null) {
            z65.z("mViewPager");
            viewPager = null;
        }
        String str = (viewPager.getCurrentItem() + 1) + " " + imagesActivity.getString(R.string.ecc_from) + " " + imagesActivity.collectionSize;
        TextView textView2 = imagesActivity.titleTextView;
        if (textView2 == null) {
            z65.z("titleTextView");
        } else {
            textView = textView2;
        }
        imagesActivity.setTitle(str, textView);
    }

    private final void requestPermission() {
        if (this.style.arePermissionDescriptionDialogsEnabled) {
            showStoragePermissionDescriptionDialog();
        } else {
            startStoragePermissionActivity(1);
        }
    }

    private final void setClickForBackBtn(ImageButton imageButton) {
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: lw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagesActivity.setClickForBackBtn$lambda$3(ImagesActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickForBackBtn$lambda$3(ImagesActivity imagesActivity, View view) {
        z65.h(imagesActivity, "this$0");
        imagesActivity.onBackPressed();
    }

    private final void showStoragePermissionDescriptionDialog() {
        if (this.permissionDescrAlertFragment == null) {
            this.permissionDescrAlertFragment = PermissionDescriptionAlertFragment.Companion.newInstance(PermissionDescriptionType.STORAGE, 1);
        }
        PermissionDescriptionAlertFragment permissionDescriptionAlertFragment = this.permissionDescrAlertFragment;
        if (permissionDescriptionAlertFragment != null) {
            permissionDescriptionAlertFragment.show(getSupportFragmentManager(), PermissionDescriptionAlertFragment.TAG);
        }
    }

    private final void startStoragePermissionActivity(int i) {
        if (i == 1) {
            PermissionsActivity.Companion.startActivityForResult(this, 1, R.string.ecc_permissions_write_external_storage_help_text, false, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 10) {
            downloadImage();
        }
    }

    @Override // im.threads.ui.fragments.PermissionDescriptionAlertFragment.OnAllowPermissionClickListener
    public void onAllowClick(PermissionDescriptionType permissionDescriptionType, int i) {
        z65.h(permissionDescriptionType, MessageAttributes.TYPE);
        if (PermissionDescriptionType.STORAGE == permissionDescriptionType) {
            startStoragePermissionActivity(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.threads.ui.activities.BaseActivity, androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ecc_activity_images);
        View findViewById = findViewById(R.id.toolbar);
        z65.g(findViewById, "findViewById(R.id.toolbar)");
        View findViewById2 = findViewById(R.id.toolbar_shadow);
        z65.g(findViewById2, "findViewById(R.id.toolbar_shadow)");
        initToolbar((Toolbar) findViewById, findViewById2);
        View findViewById3 = findViewById(R.id.pager);
        z65.g(findViewById3, "findViewById(R.id.pager)");
        ViewPager viewPager = (ViewPager) findViewById3;
        this.mViewPager = viewPager;
        if (viewPager == null) {
            z65.z("mViewPager");
            viewPager = null;
        }
        viewPager.addOnPageChangeListener(this);
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var != null) {
            bma<List<FileDescription>> allFileDescriptions = getDatabase().getAllFileDescriptions();
            final ImagesActivity$onCreate$1 imagesActivity$onCreate$1 = new ImagesActivity$onCreate$1(this);
            bma<List<FileDescription>> h = allFileDescriptions.e(new wr1() { // from class: fw4
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ImagesActivity.onCreate$lambda$0(Function1.this, obj);
                }
            }).k(dw9.b()).h(ti.c());
            final ImagesActivity$onCreate$2 imagesActivity$onCreate$2 = new ImagesActivity$onCreate$2(this);
            wr1<? super List<FileDescription>> wr1Var = new wr1() { // from class: gw4
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ImagesActivity.onCreate$lambda$1(Function1.this, obj);
                }
            };
            final ImagesActivity$onCreate$3 imagesActivity$onCreate$3 = ImagesActivity$onCreate$3.INSTANCE;
            wn1Var.b(h.i(wr1Var, new wr1() { // from class: hw4
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ImagesActivity.onCreate$lambda$2(Function1.this, obj);
                }
            }));
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        z65.h(menu, "menu");
        getMenuInflater().inflate(R.menu.ecc_menu_gallery, menu);
        if (menu.size() > 0) {
            ColorsHelper.setDrawableColor(this, menu.getItem(0).getIcon(), this.style.chatToolbarTextColorResId);
            menu.getItem(0).getIcon();
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var != null) {
            wn1Var.a();
        }
        this.compositeDisposable = null;
    }

    @Override // im.threads.ui.fragments.PermissionDescriptionAlertFragment.OnAllowPermissionClickListener
    public void onDialogDetached() {
        this.permissionDescrAlertFragment = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        z65.h(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId == R.id.download) {
            downloadImage();
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i) {
        ThreadRunnerKt.runOnUiThread(new Runnable() { // from class: mw4
            @Override // java.lang.Runnable
            public final void run() {
                ImagesActivity.onPageSelected$lambda$7(ImagesActivity.this);
            }
        });
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
