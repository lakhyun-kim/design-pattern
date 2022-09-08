package src.얄팍한코딩사전.strategy.after;

public class SearchButton {

    private MyProgram myProgram;

    public SearchButton(MyProgram _myProgram) {
        myProgram = _myProgram;
    }

    private SearchStrategy searchStrategy = new SearchStrategyAll();

    public void setSearchStrategy(SearchStrategy _searchStrategy) {
        searchStrategy = _searchStrategy;
    }

    public void onClick() {
        searchStrategy.search();
    }
}
