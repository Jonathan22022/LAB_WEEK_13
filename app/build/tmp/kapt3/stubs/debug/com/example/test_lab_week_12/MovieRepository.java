package com.example.test_lab_week_12;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u000e\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/test_lab_week_12/MovieRepository;", "", "movieService", "Lcom/example/test_lab_week_12/api/MovieService;", "movieDatabase", "Lcom/example/test_lab_week_12/database/MovieDatabase;", "(Lcom/example/test_lab_week_12/api/MovieService;Lcom/example/test_lab_week_12/database/MovieDatabase;)V", "apiKey", "", "fetchMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/test_lab_week_12/model/Movie;", "fetchMoviesFromNetwork", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.test_lab_week_12.api.MovieService movieService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.test_lab_week_12.database.MovieDatabase movieDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apiKey = "8a6981ca2124ec65ed3fcfcb057f67d2";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MovieRepository";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.test_lab_week_12.MovieRepository.Companion Companion = null;
    
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.example.test_lab_week_12.api.MovieService movieService, @org.jetbrains.annotations.NotNull()
    com.example.test_lab_week_12.database.MovieDatabase movieDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchMoviesFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.test_lab_week_12.model.Movie>> fetchMovies() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/test_lab_week_12/MovieRepository$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}