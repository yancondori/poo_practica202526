# Session Notes — Repo Structure & Git Workflow

---

## 1. Problem: Adding PDFs to BlueJ folder breaks the project

**Question:** The main folder has `.class`, `.ctxt` files. When I add a `.pdf` to the folder and try to open the BlueJ project I get "no bluej project" error. My root GitHub folder is this `poo_practica202526`. How can I add pdf or docx files?

**Answer:**

Your problem: the repo root **is** the BlueJ project (because `package.bluej` is there). BlueJ expects only its own files (`.java`, `.class`, `.ctxt`, `package.bluej`, `README.TXT`) in that folder. Adding a `.pdf` or `.docx` there confuses it.

### Option 1: Create a `docs/` folder inside the repo (recommended)

Put non-code files in a subfolder. BlueJ ignores subdirectories that don't have their own `package.bluej`, so this works fine:

```
poo_practica202526/
├── package.bluej
├── *.java, *.class, *.ctxt
└── docs/
    ├── practica.pdf
    └── notes.docx
```

To do this:

```bash
mkdir docs
# then move/copy your PDFs there
```

BlueJ will still open the project normally.

### Option 2: Restructure the repo with the BlueJ project in a subfolder

Move the BlueJ project into a subfolder and keep the repo root for everything:

```
poo_practica202526/
├── proyecto_bluej/
│   ├── package.bluej
│   └── *.java, *.class, *.ctxt
├── practica.pdf
└── notes.docx
```

This is cleaner but requires you to open the subfolder in BlueJ instead of the root. More disruptive to set up.

### Option 3: Use GitHub Releases or Wiki

Upload PDFs/docs to your GitHub repo's **Releases** or **Wiki** section instead of the repo files. This keeps the repo clean but the files are separate from the code.

**Recommendation: Option 1** — just create a `docs/` folder. It's the simplest, BlueJ won't break, and everything stays in one repo.

---

## 2. DevOps best practice: folder structure

**Question:** What is the usual recommended good practice in DevOps in general about folder structure? Should there be one folder for code and another for docs, both at the same hierarchy level inside a project root folder repo?

**Answer:**

Yes, that's exactly right. The standard convention is:

```
project-root/
├── src/           # source code only
├── docs/          # documentation, PDFs, diagrams
├── tests/         # test code
├── build/         # compiled output (usually .gitignored)
├── .gitignore
├── README.md
└── LICENSE
```

### Key principles

1. **Separation of concerns** — code, docs, tests, and build artifacts each get their own top-level folder, all siblings at the same hierarchy level
2. **Root is for config only** — the repo root should have project-level files (`README.md`, `.gitignore`, `LICENSE`, CI config) but not actual code or docs
3. **Don't commit build artifacts** — `.class` files, binaries, etc. should be in `.gitignore`. They can be regenerated from source

### For a Java project specifically

```
project-root/
├── src/
│   └── main/
│       └── java/
│           └── *.java
├── docs/
│   └── practica.pdf
├── tests/
├── .gitignore      # ignores *.class, *.ctxt, build/
└── README.md
```

### BlueJ constraint

BlueJ doesn't follow this convention — it expects everything flat in one folder. So for your current course, the `docs/` subfolder is the pragmatic compromise. BlueJ forces the flat structure for code, but you can still separate docs properly.

For future projects outside BlueJ (using Maven, Gradle, IntelliJ, VS Code, etc.), you'd follow the full `src/docs/tests/` structure from day one.

---

## 3. Git push routine with mnemonic tips

**Question:** Give me the git commands routine to push, add mnemonic tips.

**Answer:**

```bash
git status          # see what changed
git add .           # stage all changes
git commit -m "msg" # snapshot with a message
git push            # upload to GitHub
```

### Mnemonic: **"S-A-C-P"** → "Save A Commit, Push"

| Command | Mnemonic | Think of it as... |
|---|---|---|
| `git status` | **S**ee | "What's different right now?" |
| `git add .` | **A**dd | "Pack your bags for the trip" |
| `git commit -m` | **C**apture | "Take a photo of this moment" |
| `git push` | **P**ublish | "Send the photo to the cloud" |

### Common variations

```bash
# Stage specific file instead of everything
git add MecanicoEfectivo.java

# Check what's staged before committing
git diff --staged

# Push to a specific branch the first time
git push -u origin main
```

### Quick mental model

> **Status → Add → Commit → Push**
>
> Like packing a suitcase: first *check* what's on the floor, *pack* it in the bag, *label* the bag, then *ship* it.
