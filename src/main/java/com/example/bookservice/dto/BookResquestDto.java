package com.example.bookservice.dto;

public class BookResquestDto {
    private String title;
    private String author;
    private String genre;

    public BookResquestDto() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BookResquestDto)) return false;
        final BookResquestDto other = (BookResquestDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$author = this.getAuthor();
        final Object other$author = other.getAuthor();
        if (this$author == null ? other$author != null : !this$author.equals(other$author)) return false;
        final Object this$genre = this.getGenre();
        final Object other$genre = other.getGenre();
        if (this$genre == null ? other$genre != null : !this$genre.equals(other$genre)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BookResquestDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        final Object $genre = this.getGenre();
        result = result * PRIME + ($genre == null ? 43 : $genre.hashCode());
        return result;
    }

    public String toString() {
        return "BookResquestDto(title=" + this.getTitle() + ", author=" + this.getAuthor() + ", genre=" + this.getGenre() + ")";
    }
}
