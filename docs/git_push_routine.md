# Git Push Routine

## Question

> Give me the git commands routine to push, add mnemonic tips

## Git Push Routine

```bash
git status          # see what changed
git add .           # stage all changes
git commit -m "msg" # snapshot with a message
git push            # upload to GitHub
```

---

### Mnemonic: **"S-A-C-P"** → "Save A Commit, Push"

| Command | Mnemonic | Think of it as... |
|---|---|---|
| `git status` | **S**ee | "What's different right now?" |
| `git add .` | **A**dd | "Pack your bags for the trip" |
| `git commit -m` | **C**apture | "Take a photo of this moment" |
| `git push` | **P**ublish | "Send the photo to the cloud" |

---

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
