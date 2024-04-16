package com.facebook.flipper.plugins.databases;

import android.content.Context;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.plugins.databases.impl.SqliteDatabaseDriver;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class DatabasesFlipperPlugin implements FlipperPlugin {
    private static final String ID = "Databases";
    private final DatabasesManager databasesManager;

    public DatabasesFlipperPlugin(Context context) {
        this(new SqliteDatabaseDriver(context));
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return ID;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onConnect(FlipperConnection flipperConnection) {
        this.databasesManager.setConnection(flipperConnection);
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onDisconnect() {
        this.databasesManager.setConnection(null);
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return false;
    }

    public DatabasesFlipperPlugin(DatabaseDriver databaseDriver) {
        this(Collections.singletonList(databaseDriver));
    }

    public DatabasesFlipperPlugin(List<DatabaseDriver> list) {
        this.databasesManager = new DatabasesManager(list);
    }
}
