LATEX=latexmk -pdf -interaction=nonstopmode
PAPER=slides

# .PHONY: all clean viewpdf continuous-update

all: $(PAPER).pdf

$(PAPER).pdf: clean
	# Only compile with verbose if the quiet build fails
	$(LATEX) $(PAPER).tex -quiet
	# Comment because latexmk annoyingly doesn't end output with a newline

continuous-update:
	watchy -w `find -name "*.tex" -or -name "*.cls" | paste -s -d ,` make

viewpdf: $(PAPER).pdf
	open $(PAPER).pdf

clean:
	latexmk -c && rm -fv $(PAPER).dvi $(PAPER).ps $(PAPER).gz $(PAPER).log $(PAPER).blg $(PAPER).image.tex $(PAPER).brf $(PAPER).haux $(PAPER).htoc $(PAPER).hbbl $(PAPER).out $(PAPER).tdo $(PAPER).pdf $(PAPER).synctex.gz

