
.PHONY: all slides.pdf clean
all: slides.pdf
slides.pdf:
	TEXINPUTS=:. latexmk -pdf -silent slides.tex
clean:
	rm -f *.aux *.bbl *.blg *.fls *.fdb_latexmk *.log *.pdf *~ sildes.out
