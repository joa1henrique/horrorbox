---
name: Midnight Cinema
colors:
  surface: '#131313'
  surface-dim: '#131313'
  surface-bright: '#393939'
  surface-container-lowest: '#0e0e0e'
  surface-container-low: '#1c1b1b'
  surface-container: '#201f1f'
  surface-container-high: '#2a2a2a'
  surface-container-highest: '#353534'
  on-surface: '#e5e2e1'
  on-surface-variant: '#e0c0b1'
  inverse-surface: '#e5e2e1'
  inverse-on-surface: '#313030'
  outline: '#a88b7d'
  outline-variant: '#594236'
  surface-tint: '#ffb691'
  primary: '#ffb691'
  on-primary: '#552100'
  primary-container: '#ff7518'
  on-primary-container: '#5c2400'
  inverse-primary: '#9e4300'
  secondary: '#dcb8ff'
  on-secondary: '#480081'
  secondary-container: '#7701d0'
  on-secondary-container: '#dcb7ff'
  tertiary: '#dfb7ff'
  on-tertiary: '#4b007e'
  tertiary-container: '#c37fff'
  on-tertiary-container: '#510089'
  error: '#ffb4ab'
  on-error: '#690005'
  error-container: '#93000a'
  on-error-container: '#ffdad6'
  primary-fixed: '#ffdbcb'
  primary-fixed-dim: '#ffb691'
  on-primary-fixed: '#341100'
  on-primary-fixed-variant: '#783100'
  secondary-fixed: '#efdbff'
  secondary-fixed-dim: '#dcb8ff'
  on-secondary-fixed: '#2c0051'
  on-secondary-fixed-variant: '#6700b5'
  tertiary-fixed: '#f1daff'
  tertiary-fixed-dim: '#dfb7ff'
  on-tertiary-fixed: '#2d004f'
  on-tertiary-fixed-variant: '#690bac'
  background: '#131313'
  on-background: '#e5e2e1'
  surface-variant: '#353534'
typography:
  display-lg:
    fontFamily: Inter
    fontSize: 40px
    fontWeight: '800'
    lineHeight: 48px
    letterSpacing: -0.02em
  display-lg-mobile:
    fontFamily: Inter
    fontSize: 32px
    fontWeight: '800'
    lineHeight: 40px
    letterSpacing: -0.02em
  headline-lg:
    fontFamily: Inter
    fontSize: 28px
    fontWeight: '700'
    lineHeight: 36px
    letterSpacing: -0.01em
  headline-md:
    fontFamily: Inter
    fontSize: 22px
    fontWeight: '700'
    lineHeight: 28px
    letterSpacing: -0.01em
  headline-sm:
    fontFamily: Inter
    fontSize: 18px
    fontWeight: '600'
    lineHeight: 24px
    letterSpacing: 0em
  title-md:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '600'
    lineHeight: 22px
    letterSpacing: 0.005em
  body-lg:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
    letterSpacing: 0em
  body-md:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '400'
    lineHeight: 20px
    letterSpacing: 0em
  label-lg:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '600'
    lineHeight: 20px
    letterSpacing: 0.01em
  label-md:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '600'
    lineHeight: 16px
    letterSpacing: 0.02em
  label-sm:
    fontFamily: Inter
    fontSize: 11px
    fontWeight: '700'
    lineHeight: 14px
    letterSpacing: 0.04em
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  gutter: 1rem
  gutter-sm: 0.75rem
  margin: 1rem
  margin-md: 1.5rem
  space-xs: 0.25rem
  space-sm: 0.5rem
  space-md: 1rem
  space-lg: 1.5rem
  space-xl: 2rem
---

## Brand & Style
The design system defines an atmospheric, high-contrast dark visual identity built for horror and thriller cinema enthusiasts. It marries the authoritative cataloging structure of premier entertainment databases with a refined, nocturnal Halloween ambiance. The visual direction avoids cheap pastiche in favor of cinematic dread and calculated suspense.

- **Design Style**: High-Contrast Tonal Minimalism with Tactical Glow. Surfaces lean into obsidian depth while vivid embers of pumpkin orange and mystic violet drive focus without causing eye strain.
- **Target Audience**: Dedicated horror fans, genre film collectors, and midnight cinephiles demanding rapid, immersive lookups, detailed metadata, and content tracking in low-light environments.
- **Emotional Response**: Evokes tension, curiosity, and sleek modernity. Elements feel tactile, crisp, and weighted, creating an experience akin to operating high-end projection equipment in a dark theater.

## Colors
The color palette strictly adheres to WCAG AAA standards for contrast, ensuring all readable text maintains a contrast ratio well above 7:1 against their respective container backgrounds.

### Color Tokens & Assignments
- **Background Root (`#121212`)**: True deep obsidian for page canvases, reducing OLED battery draw and eye fatigue.
- **Surface Level 1 (`#1A1A1A`)**: Lead charcoal for toolbars, persistent navigation, and secondary panel backdrops.
- **Surface Level 2 (`#242424`)**: Elevated container fill for cards, dialogs, sheets, and carousel cells.
- **Structural Outlines (`#333333`)**: Crisp structural borders to maintain medium-fidelity clarity and geometric separation without visual noise.
- **Primary Text (`#FFFFFF` / `#F8F9FA`)**: Maximum luminance text used for titles, lead metrics, and critical metadata. Contrast ratio against `#121212` is 19.5:1; against `#242424` is 14.8:1.
- **Secondary Text (`#E0E0E0`)**: High-contrast descriptive text, movie loglines, and active labels. Contrast ratio against `#242424` exceeds 11:1.
- **Tertiary / Support Text (`#B3B3B3`)**: Structural labels, timestamps, and rating subtexts. Retains a contrast ratio above 7.3:1 against `#242424`.
- **Primary Accent (`#FF7518`)**: Pumpkin ember orange. Reserved for primary calls to action, user score highlights, and active filter states. When paired with text, it uses `#121212` foreground for compliance.
- **Secondary Accent (`#8A2BE2`)**: Mystic violet for secondary interactive accents, watchlist tags, and featured badges.
- **Tertiary Accent (`#6A0DAD`)**: Deep occult purple for state indicators, active segmented pills, and subtle glowing scrim borders.

## Typography
Typography relies on the grotesque clarity of Inter to ensure immediate legibility under tight density parameters. Movie runtimes, scare factor indices, cast lists, and user scores demand high data density and zero ambiguity.

- **Weight Hierarchy**: Bold (700) and Extra Bold (800) drive strong editorial punch for film titles. Medium (500) and SemiBold (600) handle actionable metadata. Regular (400) is prioritized for plot synopses and user reviews.
- **Letter Spacing**: Tight tracking on large display items creates a compact, cinematic presence; wide tracking on small labels (`label-sm`) prevents ink trapping on OLED matrices.
- **Scaling Rule**: Any title exceeding 32px automatically clamps to `display-lg-mobile` on mobile screens to preserve line budgeting in tight movie header layouts.

## Layout & Spacing
The layout model follows a structured mobile-first fluid grid optimized for high-density listing, film posters, and fast thumb interactions.

- **Grid Architecture**: 
  - Mobile (viewport &lt; 600px): 4-column fluid grid, `1rem` outer screen margin, `1rem` gutters. Film cards align into 2-column or horizontal scroll lanes.
  - Tablet (600px - 1024px): 8-column fluid grid, `1.5rem` outer margin, `1rem` gutters.
  - Desktop / Tablet Landscape (&gt; 1024px): 12-column grid constrained to a 1200px max-width container, centering the interface.
- **Rhythm & Touch Standards**:
  - All actionable touch areas respect a mandatory minimum bounding box of 48px × 48px.
  - Interior padding follows standard tokens: `space-sm` (8px) for badge internals, `space-md` (16px) for card body padding, and `space-xl` (32px) for distinct vertical section blocks.

## Elevation & Depth
In a pure dark-mode paradigm, drop shadows on black surfaces provide minimal value. Visual hierarchy is instead established through layered tonal surfaces and low-contrast borders:

- **Level 0 (Canvas)**: `#121212` baseline canvas, non-elevated.
- **Level 1 (Docked/Bar Surfaces)**: `#1A1A1A` with a 1px solid border (`#333333`) positioned along dividing planes.
- **Level 2 (Cards & Carousels)**: `#242424` equipped with a full perimeter 1px border (`#333333`).
- **Level 3 (Modals & Bottom Sheets)**: `#242424` combined with a soft, tinted ambient occlusion glow: `0px 12px 32px -4px rgba(0, 0, 0, 0.85), 0px 0px 1px 1px rgba(255, 117, 24, 0.15)`.
- **Active Focus & Hover Depth**: Active cards and focused interactive controls subtly intensify their perimeter border from `#333333` to `#FF7518` (or `#8A2BE2`), instantly indicating selection state without structural layout shift.

## Shapes
The shape system prioritizes modern, streamlined geometries ranging between 12px and 16px to balance filmic seriousness with ergonomic mobile handling.

- **Base Radius (12px / `0.75rem`)**: Standard interactive inputs, small chips, metadata badges, and thumbnail poster frames.
- **Large Radius (16px / `1rem`)**: Movie summary cards, review containers, bottom navigation sheets, and modal viewports.
- **Pill (Full Radius / `9999px`)**: Exclusively reserved for category tags, quick-filter chips, and floating action indicators.
- **Strict Prohibition**: Sharp 0px corners are disallowed to avoid an unfinished industrial appearance; overly rounded bubble forms are avoided to preserve genre edge.

## Components

### Buttons
- **Primary Button**: Solid `#FF7518` background, `#121212` bold text. Height minimum 48px (52px for primary movie actions). Roundedness: 12px. Padding: 12px 24px.
- **Secondary Button**: `#1A1A1A` background with a 1.5px solid border in `#8A2BE2` and text in `#FFFFFF`. Height: 48px.
- **Ghost/Tertiary Button**: Transparent background, `#FFFFFF` text, subtle `#333333` border. Hover/Press transitions to `#242424`.

### Chips & Badges
- **Genre & Rating Badges**: Solid `#242424` surface with a 1px border in `#333333`. Font: `label-sm` in `#E0E0E0`. Padding: 4px 10px. Roundedness: 9999px.
- **Spook / Jumpscare Meter Pill**: `#6A0DAD` background, `#FFFFFF` bold text, with flame/skull iconography tinted `#FF7518`.
- **Selected Filter Chip**: `#FF7518` fill with `#121212` text or `#8A2BE2` fill with `#FFFFFF` text.

### Cards (Media & Reviews)
- **Movie Poster Card**: Background `#242424`, 1px perimeter border `#333333`, rounded to 16px. Aspect ratio 2:3 for poster display. Inner metadata padding: 12px. Title in `#FFFFFF` (clamp 2 lines), subtext in `#B3B3B3`.
- **Review Card**: `#242424` flat background, 1px `#333333` border, 16px padding. Includes reviewer handle (`#F8F9FA`), timestamp (`#B3B3B3`), and high-contrast star/score indicator in `#FF7518`.

### Input Fields & Search Bars
- **Search Field**: Background `#1A1A1A`, 1px border `#333333`. Height: 52px. Text in `#FFFFFF`, placeholder in `#B3B3B3`. Left-aligned search icon tinted `#FF7518`. Roundedness: 12px. Active focus state triggers border color shift to `#FF7518`.

### Lists & Cell Rows
- **List Dividers**: Hairline 1px solid dividers using `#333333`.
- **List Item Height**: Minimum 64px row height to guarantee accessibility. Lead media thumbnail left, title in `#FFFFFF`, metadata stacked in `#E0E0E0` / `#B3B3B3`, right-aligned chevron icon tinted `#B3B3B3`.

### Selection Controls
- **Checkboxes & Radios**: Minimum touch wrapper 48px × 48px; visual indicator 24px × 24px. Inactive state: 2px border `#333333`, fill transparent. Active state: `#FF7518` fill with `#121212` checkmark icon or `#8A2BE2` inner dot.