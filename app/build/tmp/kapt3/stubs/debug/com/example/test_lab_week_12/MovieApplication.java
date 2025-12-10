package com.example.test_lab_week_12;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/example/test_lab_week_12/MovieApplication;", "Landroid/app/Application;", "()V", "<set-?>", "Lcom/example/test_lab_week_12/database/MovieDatabase;", "movieDatabase", "getMovieDatabase", "()Lcom/example/test_lab_week_12/database/MovieDatabase;", "movieRepository", "Lcom/example/test_lab_week_12/MovieRepository;", "getMovieRepository", "()Lcom/example/test_lab_week_12/MovieRepository;", "setMovieRepository", "(Lcom/example/test_lab_week_12/MovieRepository;)V", "onCreate", "", "Companion", "app_debug"})
public final class MovieApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MovieApplication";
    private com.example.test_lab_week_12.database.MovieDatabase movieDatabase;
    public com.example.test_lab_week_12.MovieRepository movieRepository;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.test_lab_week_12.MovieApplication.Companion Companion = null;
    
    public MovieApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.test_lab_week_12.database.MovieDatabase getMovieDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.test_lab_week_12.MovieRepository getMovieRepository() {
        return null;
    }
    
    public final void setMovieRepository(@org.jetbrains.annotations.NotNull()
    com.example.test_lab_week_12.MovieRepository p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/test_lab_week_12/MovieApplication$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}